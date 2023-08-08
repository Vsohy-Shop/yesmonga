package com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.design.components.widgets.counter.CustomCountDownTimer;
import com.carrefour.fid.android.shared.base.C28505u;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.e */
public final class C26906e {
    @C12579k

    /* renamed from: a */
    public static final C26906e f65557a = new C26906e();

    /* renamed from: b */
    public static final int f65558b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.e$a */
    public interface C26907a extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.e$a$a */
        public static final class C26908a implements C26907a {
            @C12579k

            /* renamed from: a */
            public static final C26908a f65559a = new C26908a();

            /* renamed from: b */
            public static final int f65560b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.e$a$b */
        public static final class C26909b implements C26907a {
            @C12579k

            /* renamed from: a */
            public static final C26909b f65561a = new C26909b();

            /* renamed from: b */
            public static final int f65562b = 0;
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.e$b */
    public interface C26910b extends C28505u.C28509d {

        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.e$b$a */
        public static final class C26911a {
            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            /* renamed from: a */
            public static C28505u.C28509d m114013a(@C12579k C26910b bVar) {
                return C28505u.C28509d.C28510a.m118428a(bVar);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.e$b$b */
        public static final class C26912b implements C26910b {
            @C12579k

            /* renamed from: b */
            public static final C26912b f65563b = new C26912b();

            /* renamed from: c */
            public static final int f65564c = 0;

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26911a.m114013a(this);
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.e$c */
    public interface C26913c extends C28505u.C28507b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.e$c$a */
        public static final class C26914a implements C26913c {

            /* renamed from: b */
            public static final int f65565b = 0;
            @C12579k

            /* renamed from: a */
            public final CustomCountDownTimer.CountDownState f65566a;

            public C26914a(@C12579k CustomCountDownTimer.CountDownState countDownState) {
                Intrinsics.checkNotNullParameter(countDownState, "state");
                this.f65566a = countDownState;
            }

            /* renamed from: c */
            public static /* synthetic */ C26914a m114014c(C26914a aVar, CustomCountDownTimer.CountDownState countDownState, int i, Object obj) {
                if ((i & 1) != 0) {
                    countDownState = aVar.f65566a;
                }
                return aVar.mo78154b(countDownState);
            }

            @C12579k
            /* renamed from: a */
            public final CustomCountDownTimer.CountDownState mo78153a() {
                return this.f65566a;
            }

            @C12579k
            /* renamed from: b */
            public final C26914a mo78154b(@C12579k CustomCountDownTimer.CountDownState countDownState) {
                Intrinsics.checkNotNullParameter(countDownState, "state");
                return new C26914a(countDownState);
            }

            @C12579k
            /* renamed from: d */
            public final CustomCountDownTimer.CountDownState mo78155d() {
                return this.f65566a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26914a) && this.f65566a == ((C26914a) obj).f65566a;
            }

            public int hashCode() {
                return this.f65566a.hashCode();
            }

            @C12579k
            public String toString() {
                CustomCountDownTimer.CountDownState countDownState = this.f65566a;
                return "ExpiredAdditionalOrder(state=" + countDownState + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.e$c$b */
        public static final class C26915b implements C26913c {
            @C12579k

            /* renamed from: a */
            public static final C26915b f65567a = new C26915b();

            /* renamed from: b */
            public static final int f65568b = 0;
        }
    }
}
