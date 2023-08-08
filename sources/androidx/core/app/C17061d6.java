package androidx.core.app;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.core.content.C17318d;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.core.app.d6 */
public final class C17061d6 implements Iterable<Intent> {

    /* renamed from: c */
    public static final String f45020c = "TaskStackBuilder";

    /* renamed from: a */
    public final ArrayList<Intent> f45021a = new ArrayList<>();

    /* renamed from: b */
    public final Context f45022b;

    @C0376v0(16)
    /* renamed from: androidx.core.app.d6$a */
    public static class C17062a {
        @C0373u
        /* renamed from: a */
        public static PendingIntent m78899a(Context context, int i, Intent[] intentArr, int i2, Bundle bundle) {
            return PendingIntent.getActivities(context, i, intentArr, i2, bundle);
        }
    }

    /* renamed from: androidx.core.app.d6$b */
    public interface C17063b {
        @C0363p0
        /* renamed from: l */
        Intent mo1500l();
    }

    public C17061d6(Context context) {
        this.f45022b = context;
    }

    @C0359n0
    /* renamed from: r */
    public static C17061d6 m78884r(@C0359n0 Context context) {
        return new C17061d6(context);
    }

    @Deprecated
    /* renamed from: y */
    public static C17061d6 m78885y(Context context) {
        return m78884r(context);
    }

    @Deprecated
    /* renamed from: A */
    public Intent mo51254A(int i) {
        return mo51267w(i);
    }

    /* renamed from: H */
    public int mo51255H() {
        return this.f45021a.size();
    }

    @C0359n0
    /* renamed from: M */
    public Intent[] mo51256M() {
        int size = this.f45021a.size();
        Intent[] intentArr = new Intent[size];
        if (size == 0) {
            return intentArr;
        }
        intentArr[0] = new Intent(this.f45021a.get(0)).addFlags(268484608);
        for (int i = 1; i < size; i++) {
            intentArr[i] = new Intent(this.f45021a.get(i));
        }
        return intentArr;
    }

    @C0363p0
    /* renamed from: Q */
    public PendingIntent mo51257Q(int i, int i2) {
        return mo51258W(i, i2, (Bundle) null);
    }

    @C0363p0
    /* renamed from: W */
    public PendingIntent mo51258W(int i, int i2, @C0363p0 Bundle bundle) {
        if (!this.f45021a.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.f45021a.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            return C17062a.m78899a(this.f45022b, i, intentArr, i2, bundle);
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
    }

    /* renamed from: X */
    public void mo51259X() {
        mo51260Y((Bundle) null);
    }

    /* renamed from: Y */
    public void mo51260Y(@C0363p0 Bundle bundle) {
        if (!this.f45021a.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.f45021a.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!C17318d.m79739v(this.f45022b, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f45022b.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @C0359n0
    /* renamed from: e */
    public C17061d6 mo51261e(@C0359n0 Intent intent) {
        this.f45021a.add(intent);
        return this;
    }

    @C0359n0
    /* renamed from: h */
    public C17061d6 mo51262h(@C0359n0 Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f45022b.getPackageManager());
        }
        if (component != null) {
            mo51265k(component);
        }
        mo51261e(intent);
        return this;
    }

    @C0359n0
    /* renamed from: i */
    public C17061d6 mo51263i(@C0359n0 Activity activity) {
        Intent intent;
        if (activity instanceof C17063b) {
            intent = ((C17063b) activity).mo1500l();
        } else {
            intent = null;
        }
        if (intent == null) {
            intent = C17065e0.m78902a(activity);
        }
        if (intent != null) {
            ComponentName component = intent.getComponent();
            if (component == null) {
                component = intent.resolveActivity(this.f45022b.getPackageManager());
            }
            mo51265k(component);
            mo51261e(intent);
        }
        return this;
    }

    @C0359n0
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f45021a.iterator();
    }

    @C0359n0
    /* renamed from: k */
    public C17061d6 mo51265k(@C0359n0 ComponentName componentName) {
        int size = this.f45021a.size();
        try {
            Intent b = C17065e0.m78903b(this.f45022b, componentName);
            while (b != null) {
                this.f45021a.add(size, b);
                b = C17065e0.m78903b(this.f45022b, b.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @C0359n0
    /* renamed from: q */
    public C17061d6 mo51266q(@C0359n0 Class<?> cls) {
        return mo51265k(new ComponentName(this.f45022b, cls));
    }

    @C0363p0
    /* renamed from: w */
    public Intent mo51267w(int i) {
        return this.f45021a.get(i);
    }
}
