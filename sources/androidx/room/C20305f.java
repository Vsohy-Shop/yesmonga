package androidx.room;

import androidx.annotation.C0376v0;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.C10861c;
import kotlin.annotation.C10862d;
import org.jetbrains.annotations.C12579k;

@C10862d(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.FUNCTION})
@Target({ElementType.FIELD, ElementType.METHOD})
@C10861c(AnnotationRetention.BINARY)
@Retention(RetentionPolicy.CLASS)
/* renamed from: androidx.room.f */
public @interface C20305f {
    @C12579k

    /* renamed from: j */
    public static final C20307b f52415j = C20307b.f52429a;
    @C12579k

    /* renamed from: k */
    public static final String f52416k = "[field-name]";

    /* renamed from: l */
    public static final int f52417l = 1;

    /* renamed from: m */
    public static final int f52418m = 2;

    /* renamed from: n */
    public static final int f52419n = 3;

    /* renamed from: o */
    public static final int f52420o = 4;

    /* renamed from: p */
    public static final int f52421p = 5;

    /* renamed from: q */
    public static final int f52422q = 1;

    /* renamed from: r */
    public static final int f52423r = 2;

    /* renamed from: s */
    public static final int f52424s = 3;

    /* renamed from: t */
    public static final int f52425t = 4;
    @C0376v0(21)

    /* renamed from: u */
    public static final int f52426u = 5;
    @C0376v0(21)

    /* renamed from: v */
    public static final int f52427v = 6;
    @C12579k

    /* renamed from: w */
    public static final String f52428w = "[value-unspecified]";

    @C10861c(AnnotationRetention.BINARY)
    @C0376v0(21)
    @Retention(RetentionPolicy.CLASS)
    /* renamed from: androidx.room.f$a */
    public @interface C20306a {
    }

    /* renamed from: androidx.room.f$b */
    public static final class C20307b {

        /* renamed from: a */
        public static final /* synthetic */ C20307b f52429a = new C20307b();
        @C12579k

        /* renamed from: b */
        public static final String f52430b = "[field-name]";

        /* renamed from: c */
        public static final int f52431c = 1;

        /* renamed from: d */
        public static final int f52432d = 2;

        /* renamed from: e */
        public static final int f52433e = 3;

        /* renamed from: f */
        public static final int f52434f = 4;

        /* renamed from: g */
        public static final int f52435g = 5;

        /* renamed from: h */
        public static final int f52436h = 1;

        /* renamed from: i */
        public static final int f52437i = 2;

        /* renamed from: j */
        public static final int f52438j = 3;

        /* renamed from: k */
        public static final int f52439k = 4;
        @C0376v0(21)

        /* renamed from: l */
        public static final int f52440l = 5;
        @C0376v0(21)

        /* renamed from: m */
        public static final int f52441m = 6;
        @C12579k

        /* renamed from: n */
        public static final String f52442n = "[value-unspecified]";
    }

    @C10861c(AnnotationRetention.BINARY)
    @Retention(RetentionPolicy.CLASS)
    /* renamed from: androidx.room.f$c */
    public @interface C20308c {
    }

    @C20306a
    int collate() default 1;

    String defaultValue() default "[value-unspecified]";

    boolean index() default false;

    String name() default "[field-name]";

    @C20308c
    int typeAffinity() default 1;
}
