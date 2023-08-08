package com.carrefour.fid.android.shared.base;

import androidx.compose.runtime.internal.C8567o;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.base.u */
public final class C28505u {
    @C12579k

    /* renamed from: a */
    public static final C28505u f68652a = new C28505u();

    /* renamed from: b */
    public static final int f68653b = 0;

    /* renamed from: com.carrefour.fid.android.shared.base.u$a */
    public interface C28506a {
    }

    /* renamed from: com.carrefour.fid.android.shared.base.u$b */
    public interface C28507b {
    }

    /* renamed from: com.carrefour.fid.android.shared.base.u$c */
    public interface C28508c<S extends C28509d, P extends C28509d> {
        @C12579k
        /* renamed from: a */
        S mo32307a(@C12579k S s, @C12579k P p);
    }

    /* renamed from: com.carrefour.fid.android.shared.base.u$d */
    public interface C28509d {

        /* renamed from: com.carrefour.fid.android.shared.base.u$d$a */
        public static final class C28510a {
            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            /* renamed from: a */
            public static C28509d m118428a(@C12579k C28509d dVar) {
                return dVar;
            }
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        C28509d reset();
    }

    /* renamed from: com.carrefour.fid.android.shared.base.u$e */
    public interface C28511e<S extends C28509d, I extends C28507b> {
        void sendIntent(@C12579k I i);
    }
}
