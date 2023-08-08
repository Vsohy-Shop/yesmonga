package com.contentsquare.android.sdk;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.contentsquare.android.sdk.o4 */
public final class C14576o4 {

    /* renamed from: a */
    public static final int f36062a = 0;

    @C11076d0(mo22514bv = {}, mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lcom/contentsquare/android/sdk/la;", "a", "()Lcom/contentsquare/android/sdk/la;"}, mo22517k = 3, mo22518mv = {1, 4, 3})
    /* renamed from: com.contentsquare.android.sdk.o4$a */
    public static final class C14577a extends Lambda implements C11289a<C14500la> {

        /* renamed from: a */
        public final /* synthetic */ boolean f36063a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14577a(boolean z) {
            super(0);
            this.f36063a = z;
        }

        /* renamed from: a */
        public final C14500la invoke() {
            return this.f36063a ? C14500la.EVALUATE : C14500la.BREAK;
        }
    }

    @C11076d0(mo22514bv = {}, mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lcom/contentsquare/android/sdk/la;", "a", "()Lcom/contentsquare/android/sdk/la;"}, mo22517k = 3, mo22518mv = {1, 4, 3})
    /* renamed from: com.contentsquare.android.sdk.o4$b */
    public static final class C14578b extends Lambda implements C11289a<C14500la> {

        /* renamed from: a */
        public final /* synthetic */ C14213b7 f36064a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14578b(C14213b7 b7Var) {
            super(0);
            this.f36064a = b7Var;
        }

        /* renamed from: a */
        public final C14500la invoke() {
            return this.f36064a.mo34670b(C14477k8.SCREEN_NUMBER, C14576o4.m62817a()) == C14576o4.m62817a() ? C14500la.PROPAGATE_STOP : C14500la.EVALUATE;
        }
    }

    @C11076d0(mo22514bv = {}, mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lcom/contentsquare/android/sdk/la;", "a", "()Lcom/contentsquare/android/sdk/la;"}, mo22517k = 3, mo22518mv = {1, 4, 3})
    /* renamed from: com.contentsquare.android.sdk.o4$c */
    public static final class C14579c extends Lambda implements C11289a<C14500la> {

        /* renamed from: a */
        public final /* synthetic */ C14213b7 f36065a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14579c(C14213b7 b7Var) {
            super(0);
            this.f36065a = b7Var;
        }

        /* renamed from: a */
        public final C14500la invoke() {
            return this.f36065a.mo34676h(C14477k8.LOCAL_SESSION_REPLAY_MODE, false) ? C14500la.PROPAGATE_START : C14500la.EVALUATE;
        }
    }

    @C11076d0(mo22514bv = {}, mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lcom/contentsquare/android/sdk/la;", "a", "()Lcom/contentsquare/android/sdk/la;"}, mo22517k = 3, mo22518mv = {1, 4, 3})
    /* renamed from: com.contentsquare.android.sdk.o4$d */
    public static final class C14580d extends Lambda implements C11289a<C14500la> {

        /* renamed from: a */
        public final /* synthetic */ C14213b7 f36066a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14580d(C14213b7 b7Var) {
            super(0);
            this.f36066a = b7Var;
        }

        /* renamed from: a */
        public final C14500la invoke() {
            return this.f36066a.mo34676h(C14477k8.SESSION_REPLAY_FORCE_START, false) ? C14500la.PROPAGATE_START : C14500la.EVALUATE;
        }
    }

    @C11076d0(mo22514bv = {}, mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lcom/contentsquare/android/sdk/la;", "a", "()Lcom/contentsquare/android/sdk/la;"}, mo22517k = 3, mo22518mv = {1, 4, 3})
    /* renamed from: com.contentsquare.android.sdk.o4$e */
    public static final class C14581e extends Lambda implements C11289a<C14500la> {

        /* renamed from: a */
        public final /* synthetic */ C14213b7 f36067a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14581e(C14213b7 b7Var) {
            super(0);
            this.f36067a = b7Var;
        }

        /* renamed from: a */
        public final C14500la invoke() {
            return this.f36067a.mo34676h(C14477k8.FORGET_ME, false) ? C14500la.PROPAGATE_STOP : C14500la.EVALUATE;
        }
    }

    @C11076d0(mo22514bv = {}, mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lcom/contentsquare/android/sdk/la;", "a", "()Lcom/contentsquare/android/sdk/la;"}, mo22517k = 3, mo22518mv = {1, 4, 3})
    /* renamed from: com.contentsquare.android.sdk.o4$f */
    public static final class C14582f extends Lambda implements C11289a<C14500la> {

        /* renamed from: a */
        public final /* synthetic */ C14213b7 f36068a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14582f(C14213b7 b7Var) {
            super(0);
            this.f36068a = b7Var;
        }

        /* renamed from: a */
        public final C14500la invoke() {
            return !this.f36068a.mo34676h(C14477k8.TRACKING_ENABLE, false) ? C14500la.PROPAGATE_STOP : C14500la.EVALUATE;
        }
    }

    /* renamed from: a */
    public static final int m62817a() {
        return f36062a;
    }

    /* renamed from: b */
    public static final C14500la m62818b(C14500la laVar, C14213b7 b7Var) {
        Intrinsics.checkNotNullParameter(laVar, "$this$firstScreenViewRule");
        Intrinsics.checkNotNullParameter(b7Var, "preferenceStore");
        return C14542n4.m62678a(laVar, "FirstScreenViewRule", new C14578b(b7Var));
    }

    /* renamed from: c */
    public static final C14500la m62819c(C14500la laVar, boolean z) {
        Intrinsics.checkNotNullParameter(laVar, "$this$canRestartRule");
        return C14542n4.m62678a(laVar, "CanRestartRule", new C14577a(z));
    }

    /* renamed from: d */
    public static final C14500la m62820d(C14500la laVar, C14213b7 b7Var) {
        Intrinsics.checkNotNullParameter(laVar, "$this$forceCustomerStartRule");
        Intrinsics.checkNotNullParameter(b7Var, "preferenceStore");
        return C14542n4.m62678a(laVar, "ForceStartRule", new C14579c(b7Var));
    }

    /* renamed from: e */
    public static final C14500la m62821e(C14500la laVar, C14213b7 b7Var) {
        Intrinsics.checkNotNullParameter(laVar, "$this$forceDeveloperStartRule");
        Intrinsics.checkNotNullParameter(b7Var, "preferenceStore");
        return C14542n4.m62678a(laVar, "ForceStartRule", new C14580d(b7Var));
    }

    /* renamed from: f */
    public static final C14500la m62822f(C14500la laVar, C14213b7 b7Var) {
        Intrinsics.checkNotNullParameter(laVar, "$this$forgetMeRule");
        Intrinsics.checkNotNullParameter(b7Var, "preferenceStore");
        return C14542n4.m62678a(laVar, "ForgetMeRule", new C14581e(b7Var));
    }

    /* renamed from: g */
    public static final C14500la m62823g(C14500la laVar, C14213b7 b7Var) {
        Intrinsics.checkNotNullParameter(laVar, "$this$trackingEnableRule");
        Intrinsics.checkNotNullParameter(b7Var, "preferenceStore");
        return C14542n4.m62678a(laVar, "TrackingEnableRule", new C14582f(b7Var));
    }
}
