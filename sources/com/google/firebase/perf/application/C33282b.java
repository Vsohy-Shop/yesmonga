package com.google.firebase.perf.application;

import androidx.annotation.C0359n0;
import com.google.android.gms.common.util.C40974d0;
import com.google.firebase.perf.application.C33279a;
import com.google.firebase.perf.p049v1.ApplicationProcessState;
import java.lang.ref.WeakReference;

/* renamed from: com.google.firebase.perf.application.b */
public abstract class C33282b implements C33279a.C33281b {
    private final WeakReference<C33279a.C33281b> appStateCallback;
    private final C33279a appStateMonitor;
    private ApplicationProcessState currentAppState;
    private boolean isRegisteredForAppState;

    public C33282b() {
        this(C33279a.m134177c());
    }

    public ApplicationProcessState getAppState() {
        return this.currentAppState;
    }

    @C40974d0
    public WeakReference<C33279a.C33281b> getAppStateCallback() {
        return this.appStateCallback;
    }

    public void incrementTsnsCount(int i) {
        this.appStateMonitor.mo96269i(i);
    }

    public void onUpdateAppState(ApplicationProcessState applicationProcessState) {
        ApplicationProcessState applicationProcessState2 = this.currentAppState;
        ApplicationProcessState applicationProcessState3 = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (applicationProcessState2 == applicationProcessState3) {
            this.currentAppState = applicationProcessState;
        } else if (applicationProcessState2 != applicationProcessState && applicationProcessState != applicationProcessState3) {
            this.currentAppState = ApplicationProcessState.FOREGROUND_BACKGROUND;
        }
    }

    public void registerForAppState() {
        if (!this.isRegisteredForAppState) {
            this.currentAppState = this.appStateMonitor.mo96264b();
            this.appStateMonitor.mo96282p(this.appStateCallback);
            this.isRegisteredForAppState = true;
        }
    }

    public void unregisterForAppState() {
        if (this.isRegisteredForAppState) {
            this.appStateMonitor.mo96290x(this.appStateCallback);
            this.isRegisteredForAppState = false;
        }
    }

    public C33282b(@C0359n0 C33279a aVar) {
        this.isRegisteredForAppState = false;
        this.currentAppState = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.appStateMonitor = aVar;
        this.appStateCallback = new WeakReference<>(this);
    }
}
