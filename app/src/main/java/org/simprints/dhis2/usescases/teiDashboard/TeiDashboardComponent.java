package org.simprints.dhis2.usescases.teiDashboard;

import org.simprints.dhis2.data.dagger.PerActivity;
import org.simprints.dhis2.usescases.teiDashboard.dashboardfragments.indicators.IndicatorsComponent;
import org.simprints.dhis2.usescases.teiDashboard.dashboardfragments.indicators.IndicatorsModule;
import org.simprints.dhis2.usescases.notes.NotesComponent;
import org.simprints.dhis2.usescases.notes.NotesModule;
import org.simprints.dhis2.usescases.teiDashboard.dashboardfragments.relationships.RelationshipComponent;
import org.simprints.dhis2.usescases.teiDashboard.dashboardfragments.relationships.RelationshipModule;
import org.simprints.dhis2.usescases.teiDashboard.dashboardfragments.tei_data.TEIDataComponent;
import org.simprints.dhis2.usescases.teiDashboard.dashboardfragments.tei_data.TEIDataModule;

import androidx.annotation.NonNull;
import dagger.Subcomponent;

/**
 * Created by ppajuelo on 30/11/2017.
 */
@PerActivity
@Subcomponent(modules = TeiDashboardModule.class)
public interface TeiDashboardComponent {

    @NonNull
    IndicatorsComponent plus(IndicatorsModule indicatorsModule);

    @NonNull
    RelationshipComponent plus(RelationshipModule relationshipModule);

    @NonNull
    NotesComponent plus(NotesModule notesModule);

    @NonNull
    TEIDataComponent plus(TEIDataModule teiDataModule);

    void inject(TeiDashboardMobileActivity mobileActivity);
}
