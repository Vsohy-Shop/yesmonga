package com.urbanairship.util;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import androidx.annotation.C0348i1;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.app.C0475e;
import androidx.core.content.C17318d;
import androidx.core.util.C17970d;
import com.urbanairship.Autopilot;
import com.urbanairship.C36059m;
import com.urbanairship.UAirship;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public class HelperActivity extends C0475e {
    @C0359n0

    /* renamed from: V0 */
    public static final String f26382V0 = "com.urbanairship.util.helperactivity.PERMISSIONS_EXTRA";
    @C0359n0

    /* renamed from: W0 */
    public static final String f26383W0 = "com.urbanairship.util.helperactivity.RESULT_RECEIVER_EXTRA";
    @C0359n0

    /* renamed from: X0 */
    public static final String f26384X0 = "com.urbanairship.util.helperactivity.RESULT_INTENT_EXTRA";
    @C0359n0

    /* renamed from: Y0 */
    public static final String f26385Y0 = "com.urbanairship.util.START_ACTIVITY_INTENT_EXTRA";

    /* renamed from: U0 */
    public List<Intent> f26386U0 = new ArrayList();

    /* renamed from: com.urbanairship.util.HelperActivity$a */
    public static class C9631a {

        /* renamed from: a */
        public int f26389a = 0;

        /* renamed from: b */
        public Intent f26390b;

        @C0363p0
        /* renamed from: b */
        public Intent mo19585b() {
            return this.f26390b;
        }

        /* renamed from: c */
        public int mo19586c() {
            return this.f26389a;
        }

        /* renamed from: d */
        public final void mo19587d(int i, @C0363p0 Intent intent) {
            this.f26389a = i;
            this.f26390b = intent;
        }
    }

    /* renamed from: X0 */
    public static /* synthetic */ void m36081X0(int[] iArr, int[] iArr2) {
        if (iArr2 != null && iArr2.length == iArr.length) {
            System.arraycopy(iArr2, 0, iArr, 0, iArr.length);
        }
        synchronized (iArr) {
            iArr.notify();
        }
    }

    @C0353k0
    /* renamed from: Z0 */
    public static void m36082Z0(@C0359n0 Context context, @C0359n0 String[] strArr, @C0363p0 final C17970d<int[]> dVar) {
        Context applicationContext = context.getApplicationContext();
        int length = strArr.length;
        int[] iArr = new int[length];
        boolean z = false;
        for (int i = 0; i < length; i++) {
            int a = C17318d.m79718a(applicationContext, strArr[i]);
            iArr[i] = a;
            if (a == -1) {
                z = true;
            }
        }
        Handler handler = new Handler(Looper.getMainLooper());
        if (z) {
            applicationContext.startActivity(new Intent(applicationContext, HelperActivity.class).addFlags(268435456).setPackage(UAirship.m146180A()).putExtra(f26382V0, strArr).putExtra(f26383W0, new ResultReceiver(handler) {
                public void onReceiveResult(int i, Bundle bundle) {
                    int[] intArray = bundle.getIntArray(HelperActivity.f26384X0);
                    if (intArray == null) {
                        intArray = new int[0];
                    }
                    C17970d dVar = dVar;
                    if (dVar != null) {
                        dVar.accept(intArray);
                    }
                }
            }));
        } else if (dVar != null) {
            handler.post(new C9675r(dVar, iArr));
        }
    }

    @C0348i1
    @C0359n0
    /* renamed from: a1 */
    public static int[] m36083a1(@C0359n0 Context context, @C0359n0 String... strArr) {
        int[] iArr = new int[strArr.length];
        synchronized (iArr) {
            m36082Z0(context, strArr, new C9673q(iArr));
            try {
                iArr.wait();
            } catch (InterruptedException e) {
                C36059m.m148411g(e, "Thread interrupted when waiting for result from activity.", new Object[0]);
                Thread.currentThread().interrupt();
            }
        }
        return iArr;
    }

    @C0348i1
    @C0359n0
    /* renamed from: b1 */
    public static C9631a m36084b1(@C0359n0 Context context, @C0359n0 Intent intent) {
        Context applicationContext = context.getApplicationContext();
        final C9631a aVar = new C9631a();
        Intent putExtra = new Intent(applicationContext, HelperActivity.class).addFlags(268435456).setPackage(UAirship.m146180A()).putExtra(f26385Y0, intent).putExtra(f26383W0, new ResultReceiver(new Handler(Looper.getMainLooper())) {
            public void onReceiveResult(int i, Bundle bundle) {
                aVar.mo19587d(i, (Intent) bundle.getParcelable(HelperActivity.f26384X0));
                synchronized (aVar) {
                    aVar.notify();
                }
            }
        });
        synchronized (aVar) {
            applicationContext.startActivity(putExtra);
            try {
                aVar.wait();
            } catch (InterruptedException e) {
                C36059m.m148411g(e, "Thread interrupted when waiting for result from activity.", new Object[0]);
                Thread.currentThread().interrupt();
                return new C9631a();
            }
        }
        return aVar;
    }

    /* renamed from: V0 */
    public final void mo19581V0(@C0363p0 Intent intent) {
        if (intent != null) {
            this.f26386U0.add(intent);
        }
    }

    /* renamed from: Y0 */
    public final void mo19582Y0() {
        if (this.f26386U0.isEmpty()) {
            finish();
            return;
        }
        Intent intent = this.f26386U0.get(0);
        Intent intent2 = (Intent) intent.getParcelableExtra(f26385Y0);
        String[] stringArrayExtra = intent.getStringArrayExtra(f26382V0);
        if (intent2 != null) {
            startActivityForResult(intent2, 0);
        } else if (stringArrayExtra != null) {
            requestPermissions(stringArrayExtra, 0);
        } else {
            C36059m.m148409e("HelperActivity - Started without START_ACTIVITY_INTENT_EXTRA or PERMISSIONS_EXTRA extra.", new Object[0]);
            this.f26386U0.remove(0);
            mo19582Y0();
        }
    }

    public void onActivityResult(int i, int i2, @C0363p0 Intent intent) {
        if (this.f26386U0.isEmpty()) {
            finish();
            return;
        }
        ResultReceiver resultReceiver = (ResultReceiver) this.f26386U0.remove(0).getParcelableExtra(f26383W0);
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f26384X0, intent);
            resultReceiver.send(i2, bundle);
        }
        super.onActivityResult(i, i2, intent);
        mo19582Y0();
    }

    public final void onCreate(@C0363p0 Bundle bundle) {
        super.onCreate(bundle);
        Autopilot.m146140c(getApplication());
        if (!UAirship.m146184O() && !UAirship.m146182M()) {
            C36059m.m148409e("HelperActivity - unable to create activity, takeOff not called.", new Object[0]);
            finish();
        } else if (bundle == null) {
            mo19581V0(getIntent());
            mo19582Y0();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        for (Intent parcelableExtra : this.f26386U0) {
            ResultReceiver resultReceiver = (ResultReceiver) parcelableExtra.getParcelableExtra(f26383W0);
            if (resultReceiver != null) {
                resultReceiver.send(0, new Bundle());
            }
        }
        this.f26386U0.clear();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f26386U0.add(intent);
    }

    public void onRequestPermissionsResult(int i, @C0359n0 String[] strArr, @C0359n0 int[] iArr) {
        if (this.f26386U0.isEmpty()) {
            finish();
            return;
        }
        ResultReceiver resultReceiver = (ResultReceiver) this.f26386U0.remove(0).getParcelableExtra(f26383W0);
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putIntArray(f26384X0, iArr);
            resultReceiver.send(-1, bundle);
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
        mo19582Y0();
    }
}
