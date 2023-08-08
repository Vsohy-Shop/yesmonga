package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LiveData;
import com.google.common.util.concurrent.C32487a;

/* renamed from: androidx.work.o */
public interface C21397o {
    @SuppressLint({"SyntheticAccessor"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: a */
    public static final C21399b.C21402c f55145a = new C21399b.C21402c();
    @SuppressLint({"SyntheticAccessor"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: b */
    public static final C21399b.C21401b f55146b = new C21399b.C21401b();

    /* renamed from: androidx.work.o$b */
    public static abstract class C21399b {

        /* renamed from: androidx.work.o$b$a */
        public static final class C21400a extends C21399b {

            /* renamed from: a */
            public final Throwable f55147a;

            public C21400a(@C0359n0 Throwable th) {
                this.f55147a = th;
            }

            @C0359n0
            /* renamed from: a */
            public Throwable mo63841a() {
                return this.f55147a;
            }

            @C0359n0
            public String toString() {
                return "FAILURE (" + this.f55147a.getMessage() + ")";
            }
        }

        /* renamed from: androidx.work.o$b$b */
        public static final class C21401b extends C21399b {
            @C0359n0
            public String toString() {
                return "IN_PROGRESS";
            }

            public C21401b() {
            }
        }

        /* renamed from: androidx.work.o$b$c */
        public static final class C21402c extends C21399b {
            @C0359n0
            public String toString() {
                return "SUCCESS";
            }

            public C21402c() {
            }
        }
    }

    @C0359n0
    /* renamed from: a */
    C32487a<C21399b.C21402c> mo63599a();

    @C0359n0
    LiveData<C21399b> getState();
}
