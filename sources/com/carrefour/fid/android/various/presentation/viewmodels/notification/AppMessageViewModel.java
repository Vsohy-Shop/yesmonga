package com.carrefour.fid.android.various.presentation.viewmodels.notification;

import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.various.domain.interactor.GetAppMessageUseCase;
import com.carrefour.fid.android.various.domain.interactor.MarkAppMessageAsReadUseCase;
import com.carrefour.fid.android.various.presentation.analytics.notification.C22799a;
import com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.C22822a;
import dagger.hilt.android.lifecycle.C10245a;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010#J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\tJ\u0013\u0010\u000b\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\tJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0012H@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\tR\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 \u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006$"}, mo22516d2 = {"Lcom/carrefour/fid/android/various/presentation/viewmodels/notification/AppMessageViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/various/presentation/viewmodels/notification/mvi/a$b;", "Lcom/carrefour/fid/android/various/presentation/viewmodels/notification/mvi/a$c;", "intent", "Lkotlin/d2;", "o0", "(Lcom/carrefour/fid/android/various/presentation/viewmodels/notification/mvi/a$c;Lkotlin/coroutines/c;)Ljava/lang/Object;", "k0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "j0", "n0", "Lcom/carrefour/fid/android/various/domain/model/AppMessageType;", "type", "Lkotlin/Result;", "Lcom/carrefour/fid/android/various/domain/model/AppMessage;", "m0", "(Lcom/carrefour/fid/android/various/domain/model/AppMessageType;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/various/presentation/viewmodels/notification/mvi/a$b$d;", "p0", "Lcom/carrefour/fid/android/various/presentation/analytics/notification/a;", "a", "Lcom/carrefour/fid/android/various/presentation/analytics/notification/a;", "l0", "()Lcom/carrefour/fid/android/various/presentation/analytics/notification/a;", "analytics", "Lcom/carrefour/fid/android/various/domain/interactor/GetAppMessageUseCase;", "b", "Lcom/carrefour/fid/android/various/domain/interactor/GetAppMessageUseCase;", "getAppMessageUseCase", "Lcom/carrefour/fid/android/various/domain/interactor/MarkAppMessageAsReadUseCase;", "c", "Lcom/carrefour/fid/android/various/domain/interactor/MarkAppMessageAsReadUseCase;", "markAppMessageAsReadUseCase", "<init>", "(Lcom/carrefour/fid/android/various/presentation/analytics/notification/a;Lcom/carrefour/fid/android/various/domain/interactor/GetAppMessageUseCase;Lcom/carrefour/fid/android/various/domain/interactor/MarkAppMessageAsReadUseCase;)V", "various_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nAppMessageViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppMessageViewModel.kt\ncom/carrefour/fid/android/various/presentation/viewmodels/notification/AppMessageViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,97:1\n1#2:98\n*E\n"})
public final class AppMessageViewModel extends BaseMVIViewModel<C22822a.C22828b, C22822a.C22833c> {
    @C12579k

    /* renamed from: a */
    public final C22799a f58382a;
    @C12579k

    /* renamed from: b */
    public final GetAppMessageUseCase f58383b;
    @C12579k

    /* renamed from: c */
    public final MarkAppMessageAsReadUseCase f58384c;

    @C11067d(mo22501c = "com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel$1", mo22502f = "AppMessageViewModel.kt", mo22503i = {}, mo22504l = {27, 30}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    @C11363r0({"SMAP\nAppMessageViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppMessageViewModel.kt\ncom/carrefour/fid/android/various/presentation/viewmodels/notification/AppMessageViewModel$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,97:1\n1#2:98\n*E\n"})
    /* renamed from: com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel$1 */
    public static final class C228151 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ AppMessageViewModel this$0;

        {
            this.this$0 = r1;
        }

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C228151(this.this$0, cVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x006b  */
        @org.jetbrains.annotations.C12580l
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x002e
                if (r1 == r3) goto L_0x0024
                if (r1 != r2) goto L_0x001c
                java.lang.Object r0 = r5.L$1
                com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel r0 = (com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel) r0
                kotlin.C11661u0.m45747n(r6)
                kotlin.Result r6 = (kotlin.Result) r6
                java.lang.Object r6 = r6.mo21858l()
                goto L_0x0065
            L_0x001c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L_0x0024:
                kotlin.C11661u0.m45747n(r6)
                kotlin.Result r6 = (kotlin.Result) r6
                java.lang.Object r6 = r6.mo21858l()
                goto L_0x003e
            L_0x002e:
                kotlin.C11661u0.m45747n(r6)
                com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel r6 = r5.this$0
                com.carrefour.fid.android.various.domain.model.AppMessageType r1 = com.carrefour.fid.android.various.domain.model.AppMessageType.BROADCAST
                r5.label = r3
                java.lang.Object r6 = r6.mo67266m0(r1, r5)
                if (r6 != r0) goto L_0x003e
                return r0
            L_0x003e:
                com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel r1 = r5.this$0
                java.lang.Throwable r3 = kotlin.Result.m38705e(r6)
                if (r3 == 0) goto L_0x0070
                boolean r4 = r3 instanceof com.carrefour.fid.android.various.core.NoAppNotificationThrowable
                if (r4 != 0) goto L_0x0055
                boolean r3 = r3 instanceof com.carrefour.fid.android.various.core.NotificationAlreadyReceivedThrowable
                if (r3 == 0) goto L_0x004f
                goto L_0x0055
            L_0x004f:
                com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.a$a$d r6 = com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.C22822a.C22823a.C22827d.f58393a
                r1.emitEvent(r6)
                goto L_0x0070
            L_0x0055:
                com.carrefour.fid.android.various.domain.model.AppMessageType r3 = com.carrefour.fid.android.various.domain.model.AppMessageType.VERSION
                r5.L$0 = r6
                r5.L$1 = r1
                r5.label = r2
                java.lang.Object r6 = r1.mo67266m0(r3, r5)
                if (r6 != r0) goto L_0x0064
                return r0
            L_0x0064:
                r0 = r1
            L_0x0065:
                java.lang.Throwable r6 = kotlin.Result.m38705e(r6)
                if (r6 == 0) goto L_0x0070
                com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.a$a$d r6 = com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.C22822a.C22823a.C22827d.f58393a
                r0.emitEvent(r6)
            L_0x0070:
                kotlin.d2 r6 = kotlin.C11079d2.f28267a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel.C228151.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @C12580l
        public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C228151) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public AppMessageViewModel(@C12579k C22799a aVar, @C12579k GetAppMessageUseCase getAppMessageUseCase, @C12579k MarkAppMessageAsReadUseCase markAppMessageAsReadUseCase) {
        super(C22822a.C22828b.C22830b.f58394b, (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        MarkAppMessageAsReadUseCase markAppMessageAsReadUseCase2 = markAppMessageAsReadUseCase;
        Intrinsics.checkNotNullParameter(aVar, "analytics");
        Intrinsics.checkNotNullParameter(getAppMessageUseCase, "getAppMessageUseCase");
        Intrinsics.checkNotNullParameter(markAppMessageAsReadUseCase2, "markAppMessageAsReadUseCase");
        this.f58382a = aVar;
        this.f58383b = getAppMessageUseCase;
        this.f58384c = markAppMessageAsReadUseCase2;
        C11723c2 unused = C12038j.m48061f(getMviScope(), (CoroutineContext) null, (CoroutineStart) null, new C228151(this, (C11045c<? super C228151>) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: j0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo67263j0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel$applyMessageAction$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel$applyMessageAction$1 r0 = (com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel$applyMessageAction$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel$applyMessageAction$1 r0 = new com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel$applyMessageAction$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel r0 = (com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel) r0
            kotlin.C11661u0.m45747n(r5)
            goto L_0x0044
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0035:
            kotlin.C11661u0.m45747n(r5)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r4.mo67269p0(r0)
            if (r5 != r1) goto L_0x0043
            return r1
        L_0x0043:
            r0 = r4
        L_0x0044:
            com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.a$b$d r5 = (com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.C22822a.C22828b.C22832d) r5
            if (r5 == 0) goto L_0x0067
            com.carrefour.fid.android.various.domain.model.AppMessage r5 = r5.mo67283h()
            if (r5 == 0) goto L_0x0067
            java.lang.String r5 = r5.getButtonUrl()
            if (r5 == 0) goto L_0x0067
            boolean r1 = kotlin.text.C11622t.isBlank(r5)
            r1 = r1 ^ r3
            if (r1 == 0) goto L_0x005c
            goto L_0x005d
        L_0x005c:
            r5 = 0
        L_0x005d:
            if (r5 == 0) goto L_0x0067
            com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.a$a$a r1 = new com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.a$a$a
            r1.<init>(r5)
            r0.emitEvent(r1)
        L_0x0067:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel.mo67263j0(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: k0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo67264k0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel$backPressed$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel$backPressed$1 r0 = (com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel$backPressed$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel$backPressed$1 r0 = new com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel$backPressed$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.C11661u0.m45747n(r7)
            goto L_0x0077
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0034:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel r2 = (com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel) r2
            kotlin.C11661u0.m45747n(r7)
            goto L_0x004b
        L_0x003c:
            kotlin.C11661u0.m45747n(r7)
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r6.mo67269p0(r0)
            if (r7 != r1) goto L_0x004a
            return r1
        L_0x004a:
            r2 = r6
        L_0x004b:
            com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.a$b$d r7 = (com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.C22822a.C22828b.C22832d) r7
            r4 = 0
            if (r7 == 0) goto L_0x005b
            com.carrefour.fid.android.various.domain.model.AppMessage r7 = r7.mo67283h()
            if (r7 == 0) goto L_0x005b
            com.carrefour.fid.android.various.domain.model.AppMessageRecurrence r7 = r7.getRecurrence()
            goto L_0x005c
        L_0x005b:
            r7 = r4
        L_0x005c:
            com.carrefour.fid.android.various.domain.model.AppMessageRecurrence$Blocker r5 = com.carrefour.fid.android.various.domain.model.AppMessageRecurrence.Blocker.INSTANCE
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r5)
            if (r7 == 0) goto L_0x006c
            com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.a$a$c r7 = com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.C22822a.C22823a.C22826c.f58392a
            r2.emitEvent(r7)
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        L_0x006c:
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r7 = r2.mo67267n0(r0)
            if (r7 != r1) goto L_0x0077
            return r1
        L_0x0077:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel.mo67264k0(kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    /* renamed from: l0 */
    public final C22799a mo67265l0() {
        return this.f58382a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: m0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo67266m0(com.carrefour.fid.android.various.domain.model.AppMessageType r5, kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.various.domain.model.AppMessage>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel$getAppMessage$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel$getAppMessage$1 r0 = (com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel$getAppMessage$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel$getAppMessage$1 r0 = new com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel$getAppMessage$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r5 = r0.L$0
            com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel r5 = (com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel) r5
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x004c
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003b:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.various.domain.interactor.GetAppMessageUseCase r6 = r4.f58383b
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.m172808invokegIAlus(r5, r0)
            if (r6 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r5 = r4
        L_0x004c:
            boolean r0 = kotlin.Result.m38710j(r6)
            if (r0 == 0) goto L_0x005d
            r0 = r6
            com.carrefour.fid.android.various.domain.model.AppMessage r0 = (com.carrefour.fid.android.various.domain.model.AppMessage) r0
            com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.a$b$d r1 = new com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.a$b$d
            r1.<init>(r0)
            r5.publishState(r1)
        L_0x005d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel.mo67266m0(com.carrefour.fid.android.various.domain.model.AppMessageType, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: n0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo67267n0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel$handleNextMessage$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel$handleNextMessage$1 r0 = (com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel$handleNextMessage$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel$handleNextMessage$1 r0 = new com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel$handleNextMessage$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0046
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel r0 = (com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel) r0
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x007b
        L_0x0036:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003e:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel r2 = (com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel) r2
            kotlin.C11661u0.m45747n(r6)
            goto L_0x0055
        L_0x0046:
            kotlin.C11661u0.m45747n(r6)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r5.mo67269p0(r0)
            if (r6 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r2 = r5
        L_0x0055:
            com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.a$b$d r6 = (com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.C22822a.C22828b.C22832d) r6
            if (r6 != 0) goto L_0x0061
            com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.a$a$b r6 = com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.C22822a.C22823a.C22825b.f58391a
            r2.emitEvent(r6)
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        L_0x0061:
            com.carrefour.fid.android.various.domain.model.AppMessage r6 = r6.mo67283h()
            com.carrefour.fid.android.various.domain.model.AppMessageType r6 = r6.getType()
            com.carrefour.fid.android.various.domain.model.AppMessageType r4 = com.carrefour.fid.android.various.domain.model.AppMessageType.BROADCAST
            if (r6 != r4) goto L_0x0087
            com.carrefour.fid.android.various.domain.model.AppMessageType r6 = com.carrefour.fid.android.various.domain.model.AppMessageType.VERSION
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r6 = r2.mo67266m0(r6, r0)
            if (r6 != r1) goto L_0x007a
            return r1
        L_0x007a:
            r0 = r2
        L_0x007b:
            java.lang.Throwable r6 = kotlin.Result.m38705e(r6)
            if (r6 == 0) goto L_0x008c
            com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.a$a$b r6 = com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.C22822a.C22823a.C22825b.f58391a
            r0.emitEvent(r6)
            goto L_0x008c
        L_0x0087:
            com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.a$a$b r6 = com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.C22822a.C22823a.C22825b.f58391a
            r2.emitEvent(r6)
        L_0x008c:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel.mo67267n0(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: o0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object processIntent(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.C22822a.C22833c r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel$processIntent$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel$processIntent$1 r0 = (com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel$processIntent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel$processIntent$1 r0 = new com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel$processIntent$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0047
            if (r2 == r5) goto L_0x003f
            if (r2 == r4) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r7 = r0.L$0
            com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel r7 = (com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel) r7
            kotlin.C11661u0.m45747n(r8)
            goto L_0x008c
        L_0x0033:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003b:
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0075
        L_0x003f:
            java.lang.Object r7 = r0.L$0
            com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel r7 = (com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel) r7
            kotlin.C11661u0.m45747n(r8)
            goto L_0x005e
        L_0x0047:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.a$c$a r8 = com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.C22822a.C22833c.C22834a.f58397a
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r8 == 0) goto L_0x0064
            r0.L$0 = r6
            r0.label = r5
            java.lang.Object r7 = r6.mo67263j0(r0)
            if (r7 != r1) goto L_0x005d
            return r1
        L_0x005d:
            r7 = r6
        L_0x005e:
            com.carrefour.fid.android.various.presentation.analytics.notification.a r7 = r7.f58382a
            r7.mo67245b()
            goto L_0x0091
        L_0x0064:
            com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.a$c$b r8 = com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.C22822a.C22833c.C22835b.f58398a
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r8 == 0) goto L_0x0078
            r0.label = r4
            java.lang.Object r7 = r6.mo67264k0(r0)
            if (r7 != r1) goto L_0x0075
            return r1
        L_0x0075:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        L_0x0078:
            com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.a$c$c r8 = com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.C22822a.C22833c.C22836c.f58399a
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r7 == 0) goto L_0x0091
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = r6.mo67267n0(r0)
            if (r7 != r1) goto L_0x008b
            return r1
        L_0x008b:
            r7 = r6
        L_0x008c:
            com.carrefour.fid.android.various.presentation.analytics.notification.a r7 = r7.f58382a
            r7.mo67246c()
        L_0x0091:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel.processIntent(com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.a$c, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: p0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo67269p0(kotlin.coroutines.C11045c<? super com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.C22822a.C22828b.C22832d> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel$readCurrentNotification$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel$readCurrentNotification$1 r0 = (com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel$readCurrentNotification$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel$readCurrentNotification$1 r0 = new com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel$readCurrentNotification$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.a$b$d r0 = (com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.C22822a.C22828b.C22832d) r0
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            r6.mo21858l()
            goto L_0x005e
        L_0x0032:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003a:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.shared.base.u$d r6 = r5.getCurrentState()
            boolean r2 = r6 instanceof com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.C22822a.C22828b.C22832d
            r4 = 0
            if (r2 == 0) goto L_0x0049
            com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.a$b$d r6 = (com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.C22822a.C22828b.C22832d) r6
            goto L_0x004a
        L_0x0049:
            r6 = r4
        L_0x004a:
            if (r6 == 0) goto L_0x005f
            com.carrefour.fid.android.various.domain.interactor.MarkAppMessageAsReadUseCase r2 = r5.f58384c
            com.carrefour.fid.android.various.domain.model.AppMessage r4 = r6.mo67283h()
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r0 = r2.m172809invokegIAlus(r4, r0)
            if (r0 != r1) goto L_0x005d
            return r1
        L_0x005d:
            r0 = r6
        L_0x005e:
            r4 = r0
        L_0x005f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel.mo67269p0(kotlin.coroutines.c):java.lang.Object");
    }
}
