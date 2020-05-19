package org.simprints.dhis2.usescases;

import org.simprints.dhis2.App;
import org.simprints.dhis2.data.server.FakeServerModule;
import org.simprints.dhis2.data.user.FakeUserModule;

public class AppTest extends App {

    @Override
    protected void setUpServerComponent() {
        serverComponent = appComponent().plus(new FakeServerModule());
        setUpUserComponent();
    }

    @Override
    protected void setUpUserComponent() {
        userComponent = serverComponent.plus(new FakeUserModule());
    }
}
