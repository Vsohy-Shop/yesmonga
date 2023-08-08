package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.motion.utils.C16831d;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: androidx.constraintlayout.motion.widget.f */
public abstract class C16881f {

    /* renamed from: A */
    public static final String f43369A = "motionProgress";

    /* renamed from: B */
    public static final String f43370B = "transitionEasing";

    /* renamed from: C */
    public static final String f43371C = "visibility";

    /* renamed from: f */
    public static int f43372f = -1;

    /* renamed from: g */
    public static final String f43373g = "alpha";

    /* renamed from: h */
    public static final String f43374h = "elevation";

    /* renamed from: i */
    public static final String f43375i = "rotation";

    /* renamed from: j */
    public static final String f43376j = "rotationX";

    /* renamed from: k */
    public static final String f43377k = "rotationY";

    /* renamed from: l */
    public static final String f43378l = "transformPivotX";

    /* renamed from: m */
    public static final String f43379m = "transformPivotY";

    /* renamed from: n */
    public static final String f43380n = "transitionPathRotate";

    /* renamed from: o */
    public static final String f43381o = "scaleX";

    /* renamed from: p */
    public static final String f43382p = "scaleY";

    /* renamed from: q */
    public static final String f43383q = "wavePeriod";

    /* renamed from: r */
    public static final String f43384r = "waveOffset";

    /* renamed from: s */
    public static final String f43385s = "wavePhase";

    /* renamed from: t */
    public static final String f43386t = "waveVariesBy";

    /* renamed from: u */
    public static final String f43387u = "translationX";

    /* renamed from: v */
    public static final String f43388v = "translationY";

    /* renamed from: w */
    public static final String f43389w = "translationZ";

    /* renamed from: x */
    public static final String f43390x = "progress";

    /* renamed from: y */
    public static final String f43391y = "CUSTOM";

    /* renamed from: z */
    public static final String f43392z = "curveFit";

    /* renamed from: a */
    public int f43393a;

    /* renamed from: b */
    public int f43394b;

    /* renamed from: c */
    public String f43395c = null;

    /* renamed from: d */
    public int f43396d;

    /* renamed from: e */
    public HashMap<String, ConstraintAttribute> f43397e;

    public C16881f() {
        int i = f43372f;
        this.f43393a = i;
        this.f43394b = i;
    }

    /* renamed from: a */
    public abstract void mo50156a(HashMap<String, C16831d> hashMap);

    /* renamed from: b */
    public abstract C16881f clone();

    /* renamed from: c */
    public C16881f mo50158c(C16881f fVar) {
        this.f43393a = fVar.f43393a;
        this.f43394b = fVar.f43394b;
        this.f43395c = fVar.f43395c;
        this.f43396d = fVar.f43396d;
        this.f43397e = fVar.f43397e;
        return this;
    }

    /* renamed from: d */
    public abstract void mo50160d(HashSet<String> hashSet);

    /* renamed from: e */
    public int mo50161e() {
        return this.f43393a;
    }

    /* renamed from: f */
    public abstract void mo50162f(Context context, AttributeSet attributeSet);

    /* renamed from: g */
    public boolean mo50163g(String str) {
        String str2 = this.f43395c;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    /* renamed from: h */
    public void mo50164h(int i) {
        this.f43393a = i;
    }

    /* renamed from: i */
    public void mo50165i(HashMap<String, Integer> hashMap) {
    }

    /* renamed from: j */
    public abstract void mo50166j(String str, Object obj);

    /* renamed from: k */
    public C16881f mo50167k(int i) {
        this.f43394b = i;
        return this;
    }

    /* renamed from: l */
    public boolean mo50168l(Object obj) {
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(obj.toString());
    }

    /* renamed from: m */
    public float mo50169m(Object obj) {
        return obj instanceof Float ? ((Float) obj).floatValue() : Float.parseFloat(obj.toString());
    }

    /* renamed from: n */
    public int mo50170n(Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() : Integer.parseInt(obj.toString());
    }
}
