package org.simprints.dhis2.data.user;

import androidx.annotation.NonNull;

import org.simprints.dhis2.data.dagger.PerUser;
import org.simprints.dhis2.data.service.ReservedValuesWorkerComponent;
import org.simprints.dhis2.data.service.ReservedValuesWorkerModule;
import org.simprints.dhis2.data.service.SyncDataWorkerComponent;
import org.simprints.dhis2.data.service.SyncDataWorkerModule;
import org.simprints.dhis2.data.service.SyncGranularRxComponent;
import org.simprints.dhis2.data.service.SyncGranularRxModule;
import org.simprints.dhis2.data.service.SyncInitWorkerComponent;
import org.simprints.dhis2.data.service.SyncInitWorkerModule;
import org.simprints.dhis2.data.service.SyncMetadataWorkerComponent;
import org.simprints.dhis2.data.service.SyncMetadataWorkerModule;
import org.simprints.dhis2.usescases.about.AboutComponent;
import org.simprints.dhis2.usescases.about.AboutModule;
import org.simprints.dhis2.usescases.datasets.dataSetTable.DataSetTableComponent;
import org.simprints.dhis2.usescases.datasets.dataSetTable.DataSetTableModule;
import org.simprints.dhis2.usescases.datasets.dataSetTable.dataSetSection.DataValueComponent;
import org.simprints.dhis2.usescases.datasets.dataSetTable.dataSetSection.DataValueModule;
import org.simprints.dhis2.usescases.datasets.datasetDetail.DataSetDetailComponent;
import org.simprints.dhis2.usescases.datasets.datasetDetail.DataSetDetailModule;
import org.simprints.dhis2.usescases.datasets.datasetInitial.DataSetInitialComponent;
import org.simprints.dhis2.usescases.datasets.datasetInitial.DataSetInitialModule;
import org.simprints.dhis2.usescases.enrollment.EnrollmentComponent;
import org.simprints.dhis2.usescases.enrollment.EnrollmentModule;
import org.simprints.dhis2.usescases.events.ScheduledEventComponent;
import org.simprints.dhis2.usescases.events.ScheduledEventModule;
import org.simprints.dhis2.usescases.eventsWithoutRegistration.eventCapture.EventCaptureComponent;
import org.simprints.dhis2.usescases.eventsWithoutRegistration.eventCapture.EventCaptureModule;
import org.simprints.dhis2.usescases.eventsWithoutRegistration.eventInitial.EventInitialComponent;
import org.simprints.dhis2.usescases.eventsWithoutRegistration.eventInitial.EventInitialModule;
import org.simprints.dhis2.usescases.eventsWithoutRegistration.eventSummary.EventSummaryComponent;
import org.simprints.dhis2.usescases.eventsWithoutRegistration.eventSummary.EventSummaryModule;
import org.simprints.dhis2.usescases.main.MainComponent;
import org.simprints.dhis2.usescases.main.MainModule;
import org.simprints.dhis2.usescases.main.program.ProgramComponent;
import org.simprints.dhis2.usescases.main.program.ProgramModule;
import org.simprints.dhis2.usescases.notes.NotesComponent;
import org.simprints.dhis2.usescases.notes.NotesModule;
import org.simprints.dhis2.usescases.notes.noteDetail.NoteDetailComponent;
import org.simprints.dhis2.usescases.notes.noteDetail.NoteDetailModule;
import org.simprints.dhis2.usescases.orgunitselector.OUTreeComponent;
import org.simprints.dhis2.usescases.orgunitselector.OUTreeModule;
import org.simprints.dhis2.usescases.programEventDetail.ProgramEventDetailComponent;
import org.simprints.dhis2.usescases.programEventDetail.ProgramEventDetailModule;
import org.simprints.dhis2.usescases.programStageSelection.ProgramStageSelectionComponent;
import org.simprints.dhis2.usescases.programStageSelection.ProgramStageSelectionModule;
import org.simprints.dhis2.usescases.qrCodes.QrComponent;
import org.simprints.dhis2.usescases.qrCodes.QrModule;
import org.simprints.dhis2.usescases.qrCodes.eventsworegistration.QrEventsWORegistrationComponent;
import org.simprints.dhis2.usescases.qrCodes.eventsworegistration.QrEventsWORegistrationModule;
import org.simprints.dhis2.usescases.qrReader.QrReaderComponent;
import org.simprints.dhis2.usescases.qrReader.QrReaderModule;
import org.simprints.dhis2.usescases.qrScanner.ScanComponent;
import org.simprints.dhis2.usescases.qrScanner.ScanModule;
import org.simprints.dhis2.usescases.reservedValue.ReservedValueComponent;
import org.simprints.dhis2.usescases.reservedValue.ReservedValueModule;
import org.simprints.dhis2.usescases.searchTrackEntity.SearchTEComponent;
import org.simprints.dhis2.usescases.searchTrackEntity.SearchTEModule;
import org.simprints.dhis2.usescases.settings.SyncManagerComponent;
import org.simprints.dhis2.usescases.settings.SyncManagerModule;
import org.simprints.dhis2.usescases.settings_program.ProgramSettingsComponent;
import org.simprints.dhis2.usescases.settings_program.SettingsProgramModule;
import org.simprints.dhis2.usescases.sms.SmsComponent;
import org.simprints.dhis2.usescases.sms.SmsModule;
import org.simprints.dhis2.usescases.sync.SyncComponent;
import org.simprints.dhis2.usescases.sync.SyncModule;
import org.simprints.dhis2.usescases.teiDashboard.TeiDashboardComponent;
import org.simprints.dhis2.usescases.teiDashboard.TeiDashboardModule;
import org.simprints.dhis2.usescases.teiDashboard.nfc_data.NfcDataWriteComponent;
import org.simprints.dhis2.usescases.teiDashboard.nfc_data.NfcDataWriteModule;
import org.simprints.dhis2.usescases.teiDashboard.teiProgramList.TeiProgramListComponent;
import org.simprints.dhis2.usescases.teiDashboard.teiProgramList.TeiProgramListModule;
import org.simprints.dhis2.utils.optionset.OptionSetComponent;
import org.simprints.dhis2.utils.optionset.OptionSetModule;

import dagger.Subcomponent;

@PerUser
@Subcomponent(modules = UserModule.class)
public interface UserComponent {

    @NonNull
    MainComponent plus(@NonNull MainModule mainModule);


    @NonNull
    ProgramEventDetailComponent plus(@NonNull ProgramEventDetailModule programEventDetailModule);


    @NonNull
    SearchTEComponent plus(@NonNull SearchTEModule searchTEModule);

    @NonNull
    TeiDashboardComponent plus(@NonNull TeiDashboardModule dashboardModule);

    @NonNull
    QrComponent plus(@NonNull QrModule qrModule);

    @NonNull
    QrEventsWORegistrationComponent plus(@NonNull QrEventsWORegistrationModule qrModule);

    @NonNull
    TeiProgramListComponent plus(@NonNull TeiProgramListModule teiProgramListModule);

    @NonNull
    ProgramComponent plus(@NonNull ProgramModule programModule);

    @NonNull
    EventInitialComponent plus(EventInitialModule eventInitialModule);

    @NonNull
    EventSummaryComponent plus(EventSummaryModule eventInitialModule);

    @NonNull
    SyncManagerComponent plus(SyncManagerModule syncManagerModule);

    @NonNull
    ProgramStageSelectionComponent plus(ProgramStageSelectionModule programStageSelectionModule);

    @NonNull
    QrReaderComponent plus(QrReaderModule qrReaderModule);

    @NonNull
    AboutComponent plus(AboutModule aboutModule);

    @NonNull
    DataSetDetailComponent plus(DataSetDetailModule dataSetDetailModel);

    @NonNull
    DataSetInitialComponent plus(DataSetInitialModule dataSetInitialModule);

    @NonNull
    DataSetTableComponent plus(DataSetTableModule dataSetTableModule);

    @NonNull
    DataValueComponent plus(DataValueModule dataValueModule);

    @NonNull
    ReservedValueComponent plus(ReservedValueModule reservedValueModule);

    @NonNull
    SyncDataWorkerComponent plus(SyncDataWorkerModule syncDataWorkerModule);

    @NonNull
    SyncMetadataWorkerComponent plus(SyncMetadataWorkerModule syncDataWorkerModule);

    @NonNull
    ReservedValuesWorkerComponent plus(ReservedValuesWorkerModule reservedValuesWorkerModule);

    @NonNull
    EventCaptureComponent plus(EventCaptureModule eventCaptureModule);

    @NonNull
    SmsComponent plus(SmsModule smsModule);

    NfcDataWriteComponent plus(NfcDataWriteModule nfcModule);

    @NonNull
    SyncGranularRxComponent plus(SyncGranularRxModule syncGranularRxModule);

    @NonNull
    SyncComponent plus(SyncModule syncModule);

    @NonNull
    SyncInitWorkerComponent plus(SyncInitWorkerModule syncInitWorkerModule);

    @NonNull
    EnrollmentComponent plus(EnrollmentModule enrollmentModule);

    @NonNull
    ScheduledEventComponent plus(ScheduledEventModule scheduledEventModule);

    @NonNull
    OptionSetComponent plus(OptionSetModule optionSetModule);

    @NonNull
    NotesComponent plus(NotesModule notesModule);

    @NonNull
    NoteDetailComponent plus(NoteDetailModule noteDetailModule);

    @NonNull
    OUTreeComponent plus(OUTreeModule ouTreeModule);

    @NonNull
    ProgramSettingsComponent plus(SettingsProgramModule settingsProgramModule);

    @NonNull
    ScanComponent plus(ScanModule scanModule);
}
