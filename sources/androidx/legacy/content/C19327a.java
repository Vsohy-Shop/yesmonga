package androidx.legacy.content;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import com.urbanairship.AirshipConfigOptions;

@Deprecated
/* renamed from: androidx.legacy.content.a */
public abstract class C19327a extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f49659a = "androidx.contentpager.content.wakelockid";

    /* renamed from: b */
    public static final SparseArray<PowerManager.WakeLock> f49660b = new SparseArray<>();

    /* renamed from: c */
    public static int f49661c = 1;

    /* renamed from: b */
    public static boolean m90469b(Intent intent) {
        int intExtra = intent.getIntExtra(f49659a, 0);
        if (intExtra == 0) {
            return false;
        }
        SparseArray<PowerManager.WakeLock> sparseArray = f49660b;
        synchronized (sparseArray) {
            PowerManager.WakeLock wakeLock = sparseArray.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                sparseArray.remove(intExtra);
                return true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("No active wake lock id #");
            sb.append(intExtra);
            return true;
        }
    }

    /* renamed from: c */
    public static ComponentName m90470c(Context context, Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = f49660b;
        synchronized (sparseArray) {
            int i = f49661c;
            int i2 = i + 1;
            f49661c = i2;
            if (i2 <= 0) {
                f49661c = 1;
            }
            intent.putExtra(f49659a, i);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(AirshipConfigOptions.f87111Y);
            sparseArray.put(i, newWakeLock);
            return startService;
        }
    }
}
