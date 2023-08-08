package com.google.zxing.integration.android;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.C8698y1;
import com.google.zxing.client.android.C34659k;
import com.journeyapps.barcodescanner.CaptureActivity;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.zxing.integration.android.a */
public class C34758a {

    /* renamed from: h */
    public static final int f84239h = 49374;

    /* renamed from: i */
    public static final String f84240i = "a";

    /* renamed from: j */
    public static final String f84241j = "UPC_A";

    /* renamed from: k */
    public static final String f84242k = "UPC_E";

    /* renamed from: l */
    public static final String f84243l = "EAN_8";

    /* renamed from: m */
    public static final String f84244m = "EAN_13";

    /* renamed from: n */
    public static final String f84245n = "RSS_14";

    /* renamed from: o */
    public static final String f84246o = "CODE_39";

    /* renamed from: p */
    public static final String f84247p = "CODE_93";

    /* renamed from: q */
    public static final String f84248q = "CODE_128";

    /* renamed from: r */
    public static final String f84249r = "ITF";

    /* renamed from: s */
    public static final String f84250s = "RSS_EXPANDED";

    /* renamed from: t */
    public static final String f84251t = "QR_CODE";

    /* renamed from: u */
    public static final String f84252u = "DATA_MATRIX";

    /* renamed from: v */
    public static final String f84253v = "PDF_417";

    /* renamed from: w */
    public static final Collection<String> f84254w = m141888k(f84241j, f84242k, f84243l, f84244m, f84245n);

    /* renamed from: x */
    public static final Collection<String> f84255x = m141888k(f84241j, f84242k, f84243l, f84244m, f84245n, f84246o, f84247p, f84248q, f84249r, f84245n, f84250s);

    /* renamed from: y */
    public static final Collection<String> f84256y = null;

    /* renamed from: a */
    public final Activity f84257a;

    /* renamed from: b */
    public Fragment f84258b;

    /* renamed from: c */
    public androidx.fragment.app.Fragment f84259c;

    /* renamed from: d */
    public final Map<String, Object> f84260d = new HashMap(3);

    /* renamed from: e */
    public Collection<String> f84261e;

    /* renamed from: f */
    public Class<?> f84262f;

    /* renamed from: g */
    public int f84263g = f84239h;

    public C34758a(Activity activity) {
        this.f84257a = activity;
    }

    @TargetApi(11)
    /* renamed from: d */
    public static C34758a m141886d(Fragment fragment) {
        C34758a aVar = new C34758a(fragment.getActivity());
        aVar.f84258b = fragment;
        return aVar;
    }

    /* renamed from: e */
    public static C34758a m141887e(androidx.fragment.app.Fragment fragment) {
        C34758a aVar = new C34758a(fragment.getActivity());
        aVar.f84259c = fragment;
        return aVar;
    }

    /* renamed from: k */
    public static List<String> m141888k(String... strArr) {
        return Collections.unmodifiableList(Arrays.asList(strArr));
    }

    /* renamed from: l */
    public static C34759b m141889l(int i, int i2, Intent intent) {
        if (i == 49374) {
            return m141890m(i2, intent);
        }
        return null;
    }

    /* renamed from: m */
    public static C34759b m141890m(int i, Intent intent) {
        Integer num;
        if (i != -1) {
            return new C34759b(intent);
        }
        String stringExtra = intent.getStringExtra(C34659k.C34660a.f83890u);
        String stringExtra2 = intent.getStringExtra(C34659k.C34660a.f83891v);
        byte[] byteArrayExtra = intent.getByteArrayExtra(C34659k.C34660a.f83893x);
        int intExtra = intent.getIntExtra(C34659k.C34660a.f83894y, Integer.MIN_VALUE);
        if (intExtra == Integer.MIN_VALUE) {
            num = null;
        } else {
            num = Integer.valueOf(intExtra);
        }
        return new C34759b(stringExtra, stringExtra2, byteArrayExtra, num, intent.getStringExtra(C34659k.C34660a.f83895z), intent.getStringExtra(C34659k.C34660a.f83865B), intent);
    }

    /* renamed from: a */
    public final C34758a mo102843a(String str, Object obj) {
        this.f84260d.put(str, obj);
        return this;
    }

    /* renamed from: b */
    public final void mo102844b(Intent intent) {
        for (Map.Entry next : this.f84260d.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (value instanceof Integer) {
                intent.putExtra(str, (Integer) value);
            } else if (value instanceof Long) {
                intent.putExtra(str, (Long) value);
            } else if (value instanceof Boolean) {
                intent.putExtra(str, (Boolean) value);
            } else if (value instanceof Double) {
                intent.putExtra(str, (Double) value);
            } else if (value instanceof Float) {
                intent.putExtra(str, (Float) value);
            } else if (value instanceof Bundle) {
                intent.putExtra(str, (Bundle) value);
            } else if (value instanceof int[]) {
                intent.putExtra(str, (int[]) value);
            } else if (value instanceof long[]) {
                intent.putExtra(str, (long[]) value);
            } else if (value instanceof boolean[]) {
                intent.putExtra(str, (boolean[]) value);
            } else if (value instanceof double[]) {
                intent.putExtra(str, (double[]) value);
            } else if (value instanceof float[]) {
                intent.putExtra(str, (float[]) value);
            } else if (value instanceof String[]) {
                intent.putExtra(str, (String[]) value);
            } else {
                intent.putExtra(str, value.toString());
            }
        }
    }

    /* renamed from: c */
    public Intent mo102845c() {
        Intent intent = new Intent(this.f84257a, mo102846f());
        intent.setAction(C34659k.C34660a.f83870a);
        if (this.f84261e != null) {
            StringBuilder sb = new StringBuilder();
            for (String next : this.f84261e) {
                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append(next);
            }
            intent.putExtra(C34659k.C34660a.f83878i, sb.toString());
        }
        intent.addFlags(C8698y1.f23302n);
        intent.addFlags(524288);
        mo102844b(intent);
        return intent;
    }

    /* renamed from: f */
    public Class<?> mo102846f() {
        if (this.f84262f == null) {
            this.f84262f = mo102847g();
        }
        return this.f84262f;
    }

    /* renamed from: g */
    public Class<?> mo102847g() {
        return CaptureActivity.class;
    }

    /* renamed from: h */
    public Map<String, ?> mo102848h() {
        return this.f84260d;
    }

    /* renamed from: i */
    public final void mo102849i() {
        mo102863z(mo102845c(), this.f84263g);
    }

    /* renamed from: j */
    public final void mo102850j(Collection<String> collection) {
        mo102855r(collection);
        mo102849i();
    }

    /* renamed from: n */
    public C34758a mo102851n(boolean z) {
        mo102843a(C34659k.C34660a.f83883n, Boolean.valueOf(z));
        return this;
    }

    /* renamed from: o */
    public C34758a mo102852o(boolean z) {
        mo102843a(C34659k.C34660a.f83882m, Boolean.valueOf(z));
        return this;
    }

    /* renamed from: p */
    public C34758a mo102853p(int i) {
        if (i >= 0) {
            mo102843a(C34659k.C34660a.f83879j, Integer.valueOf(i));
        }
        return this;
    }

    /* renamed from: q */
    public C34758a mo102854q(Class<?> cls) {
        this.f84262f = cls;
        return this;
    }

    /* renamed from: r */
    public C34758a mo102855r(Collection<String> collection) {
        this.f84261e = collection;
        return this;
    }

    /* renamed from: s */
    public C34758a mo102856s(String... strArr) {
        this.f84261e = Arrays.asList(strArr);
        return this;
    }

    /* renamed from: t */
    public C34758a mo102857t(boolean z) {
        mo102843a(C34659k.C34660a.f83888s, Boolean.valueOf(z));
        return this;
    }

    /* renamed from: u */
    public final C34758a mo102858u(String str) {
        if (str != null) {
            mo102843a(C34659k.C34660a.f83889t, str);
        }
        return this;
    }

    /* renamed from: v */
    public C34758a mo102859v(int i) {
        if (i <= 0 || i > 65535) {
            throw new IllegalArgumentException("requestCode out of range");
        }
        this.f84263g = i;
        return this;
    }

    /* renamed from: w */
    public C34758a mo102860w(long j) {
        mo102843a(C34659k.C34660a.f83884o, Long.valueOf(j));
        return this;
    }

    /* renamed from: x */
    public C34758a mo102861x(boolean z) {
        mo102843a(C34659k.C34660a.f83880k, Boolean.valueOf(z));
        return this;
    }

    /* renamed from: y */
    public void mo102862y(Intent intent) {
        Fragment fragment = this.f84258b;
        if (fragment != null) {
            fragment.startActivity(intent);
            return;
        }
        androidx.fragment.app.Fragment fragment2 = this.f84259c;
        if (fragment2 != null) {
            fragment2.startActivity(intent);
        } else {
            this.f84257a.startActivity(intent);
        }
    }

    /* renamed from: z */
    public void mo102863z(Intent intent, int i) {
        Fragment fragment = this.f84258b;
        if (fragment != null) {
            fragment.startActivityForResult(intent, i);
            return;
        }
        androidx.fragment.app.Fragment fragment2 = this.f84259c;
        if (fragment2 != null) {
            fragment2.startActivityForResult(intent, i);
        } else {
            this.f84257a.startActivityForResult(intent, i);
        }
    }
}
