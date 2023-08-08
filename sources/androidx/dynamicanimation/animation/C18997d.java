package androidx.dynamicanimation.animation;

import android.util.FloatProperty;
import androidx.annotation.C0376v0;

/* renamed from: androidx.dynamicanimation.animation.d */
public abstract class C18997d<T> {

    /* renamed from: a */
    public final String f48330a;

    /* renamed from: androidx.dynamicanimation.animation.d$a */
    public static class C18998a extends C18997d<T> {

        /* renamed from: b */
        public final /* synthetic */ FloatProperty f48331b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18998a(String str, FloatProperty floatProperty) {
            super(str);
            this.f48331b = floatProperty;
        }

        /* renamed from: b */
        public float mo55873b(T t) {
            return ((Float) this.f48331b.get(t)).floatValue();
        }

        /* renamed from: c */
        public void mo55874c(T t, float f) {
            this.f48331b.setValue(t, f);
        }
    }

    public C18997d(String str) {
        this.f48330a = str;
    }

    @C0376v0(24)
    /* renamed from: a */
    public static <T> C18997d<T> m88794a(FloatProperty<T> floatProperty) {
        return new C18998a(floatProperty.getName(), floatProperty);
    }

    /* renamed from: b */
    public abstract float mo55873b(T t);

    /* renamed from: c */
    public abstract void mo55874c(T t, float f);
}
