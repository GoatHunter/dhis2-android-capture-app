package org.simprints.dhis2.usescases.datasets.dataSetTable;

import org.simprints.dhis2.data.dagger.PerActivity;

import dagger.Subcomponent;

@Subcomponent(modules = DataSetTableModule.class)
@PerActivity
public interface DataSetTableComponent {
    void inject(DataSetTableActivity activity);
}


