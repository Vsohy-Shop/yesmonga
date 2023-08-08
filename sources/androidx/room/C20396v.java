package androidx.room;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.C10861c;
import kotlin.annotation.C10862d;
import org.jetbrains.annotations.C12579k;

@C10862d(allowedTargets = {})
@Target({})
@C10861c(AnnotationRetention.BINARY)
@Retention(RetentionPolicy.CLASS)
/* renamed from: androidx.room.v */
public @interface C20396v {

    /* renamed from: A */
    public static final int f52597A = 3;

    /* renamed from: B */
    public static final int f52598B = 4;

    /* renamed from: C */
    public static final int f52599C = 5;
    @C12579k

    /* renamed from: x */
    public static final C20398b f52600x = C20398b.f52603a;

    /* renamed from: y */
    public static final int f52601y = 1;

    /* renamed from: z */
    public static final int f52602z = 2;

    @C10861c(AnnotationRetention.BINARY)
    @Retention(RetentionPolicy.CLASS)
    /* renamed from: androidx.room.v$a */
    public @interface C20397a {
    }

    /* renamed from: androidx.room.v$b */
    public static final class C20398b {

        /* renamed from: a */
        public static final /* synthetic */ C20398b f52603a = new C20398b();

        /* renamed from: b */
        public static final int f52604b = 1;

        /* renamed from: c */
        public static final int f52605c = 2;

        /* renamed from: d */
        public static final int f52606d = 3;

        /* renamed from: e */
        public static final int f52607e = 4;

        /* renamed from: f */
        public static final int f52608f = 5;
    }

    String[] childColumns();

    boolean deferred() default false;

    Class<?> entity();

    @C20397a
    int onDelete() default 1;

    @C20397a
    int onUpdate() default 1;

    String[] parentColumns();
}
