package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40843u;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@C40473a
/* renamed from: com.google.android.gms.common.b */
public class C40678b implements ServiceConnection {

    /* renamed from: c */
    public boolean f103640c = false;

    /* renamed from: d */
    public final BlockingQueue f103641d = new LinkedBlockingQueue();

    @C40473a
    @C0359n0
    /* renamed from: a */
    public IBinder mo134106a() throws InterruptedException {
        C40843u.m166201k("BlockingServiceConnection.getService() called on main thread");
        if (!this.f103640c) {
            this.f103640c = true;
            return (IBinder) this.f103641d.take();
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    @C40473a
    @C0359n0
    /* renamed from: b */
    public IBinder mo134107b(long j, @C0359n0 TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C40843u.m166201k("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f103640c) {
            this.f103640c = true;
            IBinder iBinder = (IBinder) this.f103641d.poll(j, timeUnit);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public final void onServiceConnected(@C0359n0 ComponentName componentName, @C0359n0 IBinder iBinder) {
        this.f103641d.add(iBinder);
    }

    public final void onServiceDisconnected(@C0359n0 ComponentName componentName) {
    }
}
