package retrofit2;

import java.lang.annotation.Annotation;

/* renamed from: retrofit2.a0 */
public final class C12982a0 implements C13096z {

    /* renamed from: c4 */
    public static final C13096z f31984c4 = new C12982a0();

    /* renamed from: a */
    public static Annotation[] m56281a(Annotation[] annotationArr) {
        if (C12984b0.m56294l(annotationArr, C13096z.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[(annotationArr.length + 1)];
        annotationArr2[0] = f31984c4;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    public Class<? extends Annotation> annotationType() {
        return C13096z.class;
    }

    public boolean equals(Object obj) {
        return obj instanceof C13096z;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "@" + C13096z.class.getName() + "()";
    }
}
