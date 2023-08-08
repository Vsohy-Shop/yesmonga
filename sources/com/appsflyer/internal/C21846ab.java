package com.appsflyer.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@Deprecated
/* renamed from: com.appsflyer.internal.ab */
public final class C21846ab {
    @NonNull
    public final String AFInAppEventParameterName;
    @Nullable
    public final byte[] AFInAppEventType;
    public final boolean AFKeystoreWrapper;
    public int AFLogger$LogLevel;
    @NonNull
    public final String valueOf;
    @NonNull
    public final Map<String, String> values;

    /* renamed from: com.appsflyer.internal.ab$b */
    public static final class C21848b implements IInterface {
        private final IBinder values;

        public C21848b(IBinder iBinder) {
            this.values = iBinder;
        }

        public final String AFInAppEventParameterName() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.values.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public final boolean AFInAppEventType() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.values.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z = false;
                }
                return z;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public final IBinder asBinder() {
            return this.values;
        }
    }

    /* renamed from: com.appsflyer.internal.ab$d */
    public static final class C21849d {
        final String valueOf;
        private final boolean values;

        public C21849d(String str, boolean z) {
            this.valueOf = str;
            this.values = z;
        }

        public final boolean AFInAppEventParameterName() {
            return this.values;
        }
    }

    public C21846ab() {
    }

    public static C21849d AFKeystoreWrapper(Context context) throws Exception {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            C21847a aVar = new C21847a((byte) 0);
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                if (!context.bindService(intent, aVar, 1)) {
                    context.unbindService(aVar);
                    throw new IOException("Google Play connection failed");
                } else if (!aVar.values) {
                    aVar.values = true;
                    IBinder poll = aVar.AFKeystoreWrapper.poll(10, TimeUnit.SECONDS);
                    if (poll != null) {
                        C21848b bVar = new C21848b(poll);
                        return new C21849d(bVar.AFInAppEventParameterName(), bVar.AFInAppEventType());
                    }
                    throw new TimeoutException("Timed out waiting for the service connection");
                } else {
                    throw new IllegalStateException("Cannot call get on this connection more than once");
                }
            } finally {
                context.unbindService(aVar);
            }
        } else {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
    }

    public C21846ab(String str, byte[] bArr, String str2, Map<String, String> map, boolean z) {
        this.AFLogger$LogLevel = -1;
        this.AFInAppEventParameterName = str;
        this.AFInAppEventType = bArr;
        this.valueOf = str2;
        this.values = map;
        this.AFKeystoreWrapper = false;
    }

    /* renamed from: com.appsflyer.internal.ab$a */
    public static final class C21847a implements ServiceConnection {
        final LinkedBlockingQueue<IBinder> AFKeystoreWrapper;
        boolean values;

        private C21847a() {
            this.AFKeystoreWrapper = new LinkedBlockingQueue<>(1);
            this.values = false;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.AFKeystoreWrapper.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        public final void onServiceDisconnected(ComponentName componentName) {
        }

        public /* synthetic */ C21847a(byte b) {
            this();
        }
    }

    public C21846ab(String str, String str2) {
        this(str, (byte[]) null, str2, new HashMap(), false);
    }
}
