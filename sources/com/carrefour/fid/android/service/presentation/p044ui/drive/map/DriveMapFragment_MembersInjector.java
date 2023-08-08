package com.carrefour.fid.android.service.presentation.p044ui.drive.map;

import android.app.Application;
import com.carrefour.fid.android.shared.navigation.C28796c;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragment_MembersInjector */
public final class DriveMapFragment_MembersInjector implements C10158g<DriveMapFragment> {
    private final Provider<Application> applicationProvider;
    private final Provider<C28796c> navigatorProvider;

    public DriveMapFragment_MembersInjector(Provider<Application> provider, Provider<C28796c> provider2) {
        this.applicationProvider = provider;
        this.navigatorProvider = provider2;
    }

    public static C10158g<DriveMapFragment> create(Provider<Application> provider, Provider<C28796c> provider2) {
        return new DriveMapFragment_MembersInjector(provider, provider2);
    }

    @C10326j("com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragment.application")
    public static void injectApplication(DriveMapFragment driveMapFragment, Application application) {
        driveMapFragment.application = application;
    }

    @C10326j("com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragment.navigator")
    public static void injectNavigator(DriveMapFragment driveMapFragment, C28796c cVar) {
        driveMapFragment.navigator = cVar;
    }

    public void injectMembers(DriveMapFragment driveMapFragment) {
        injectApplication(driveMapFragment, this.applicationProvider.get());
        injectNavigator(driveMapFragment, this.navigatorProvider.get());
    }
}
