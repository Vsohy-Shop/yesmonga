package com.carrefour.fid.android.domain.interactors.feedback;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.repositories.OrderFeedbackRepository;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.domain.models.C38042l;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
public final class OrderFeedbackUseCase implements C37679f<C37685a, C38042l> {

    /* renamed from: c */
    public static final int f94538c = 8;
    @C12579k

    /* renamed from: a */
    public final OrderFeedbackRepository f94539a;
    @C12579k

    /* renamed from: b */
    public final C37823k f94540b;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.domain.interactors.feedback.OrderFeedbackUseCase$a */
    public static final class C37685a {

        /* renamed from: c */
        public static final int f94541c = 0;
        @C12580l

        /* renamed from: a */
        public final String f94542a;
        @C12579k

        /* renamed from: b */
        public final String f94543b;

        public C37685a(@C12580l String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str2, "orderNumber");
            this.f94542a = str;
            this.f94543b = str2;
        }

        /* renamed from: d */
        public static /* synthetic */ C37685a m154451d(C37685a aVar, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f94542a;
            }
            if ((i & 2) != 0) {
                str2 = aVar.f94543b;
            }
            return aVar.mo114710c(str, str2);
        }

        @C12580l
        /* renamed from: a */
        public final String mo114708a() {
            return this.f94542a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo114709b() {
            return this.f94543b;
        }

        @C12579k
        /* renamed from: c */
        public final C37685a mo114710c(@C12580l String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str2, "orderNumber");
            return new C37685a(str, str2);
        }

        @C12579k
        /* renamed from: e */
        public final String mo114711e() {
            return this.f94543b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37685a)) {
                return false;
            }
            C37685a aVar = (C37685a) obj;
            return Intrinsics.areEqual((Object) this.f94542a, (Object) aVar.f94542a) && Intrinsics.areEqual((Object) this.f94543b, (Object) aVar.f94543b);
        }

        @C12580l
        /* renamed from: f */
        public final String mo114713f() {
            return this.f94542a;
        }

        public int hashCode() {
            String str = this.f94542a;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.f94543b.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f94542a;
            String str2 = this.f94543b;
            return "Param(slotDateBegin=" + str + ", orderNumber=" + str2 + ")";
        }
    }

    @Inject
    public OrderFeedbackUseCase(@C12579k OrderFeedbackRepository orderFeedbackRepository, @C12579k C37823k kVar) {
        Intrinsics.checkNotNullParameter(orderFeedbackRepository, "feedbackRepository");
        Intrinsics.checkNotNullParameter(kVar, "getServiceSelectionUseCase");
        this.f94539a = orderFeedbackRepository;
        this.f94540b = kVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172967invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.feedback.OrderFeedbackUseCase.C37685a r8, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.C38042l>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.domain.interactors.feedback.OrderFeedbackUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.domain.interactors.feedback.OrderFeedbackUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.feedback.OrderFeedbackUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.feedback.OrderFeedbackUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.feedback.OrderFeedbackUseCase$invoke$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004c
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.lang.Object r8 = r0.L$0
            com.carrefour.fid.android.domain.models.l r8 = (com.carrefour.fid.android.domain.models.C38042l) r8
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x007d
        L_0x0036:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003e:
            java.lang.Object r8 = r0.L$0
            com.carrefour.fid.android.domain.interactors.feedback.OrderFeedbackUseCase r8 = (com.carrefour.fid.android.domain.interactors.feedback.OrderFeedbackUseCase) r8
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x0065
        L_0x004c:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.data.repositories.OrderFeedbackRepository r9 = r7.f94539a
            java.lang.String r2 = r8.mo114713f()
            java.lang.String r8 = r8.mo114711e()
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r9 = r9.mo111526a(r2, r8, r0)
            if (r9 != r1) goto L_0x0064
            return r1
        L_0x0064:
            r8 = r7
        L_0x0065:
            java.lang.Throwable r2 = kotlin.Result.m38705e(r9)
            if (r2 != 0) goto L_0x014c
            com.carrefour.fid.android.domain.models.l r9 = (com.carrefour.fid.android.domain.models.C38042l) r9
            com.carrefour.fid.android.domain.interactors.service.k r8 = r8.f94540b
            r0.L$0 = r9
            r0.label = r3
            java.lang.Object r8 = r8.m172965invokeIoAF18A(r0)
            if (r8 != r1) goto L_0x007a
            return r1
        L_0x007a:
            r6 = r9
            r9 = r8
            r8 = r6
        L_0x007d:
            boolean r0 = kotlin.Result.m38709i(r9)
            r1 = 0
            if (r0 == 0) goto L_0x0085
            r9 = r1
        L_0x0085:
            com.carrefour.fid.android.domain.models.service.models.k r9 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r9
            if (r9 == 0) goto L_0x013a
            com.carrefour.fid.android.domain.models.service.models.l r0 = r9.mo119352e()
            if (r0 != 0) goto L_0x00a2
            kotlin.Result$a r8 = kotlin.Result.f28060a
            com.carrefour.fid.android.core.io.OrderFeedbackThrowable r8 = new com.carrefour.fid.android.core.io.OrderFeedbackThrowable
            java.lang.String r9 = "store is null"
            r8.<init>(r9)
            java.lang.Object r8 = kotlin.C11661u0.m45734a(r8)
            java.lang.Object r8 = kotlin.Result.m38702b(r8)
            goto L_0x015d
        L_0x00a2:
            java.lang.String r2 = r0.mo119393w()
            boolean r2 = kotlin.text.C11622t.isBlank(r2)
            if (r2 != 0) goto L_0x0128
            com.carrefour.fid.android.domain.models.service.models.StoreService r2 = r9.mo119354f()
            if (r2 == 0) goto L_0x00b7
            java.lang.String r2 = r2.mo119175S()
            goto L_0x00b8
        L_0x00b7:
            r2 = r1
        L_0x00b8:
            r3 = 0
            if (r2 == 0) goto L_0x00c4
            boolean r2 = kotlin.text.C11622t.isBlank(r2)
            if (r2 == 0) goto L_0x00c2
            goto L_0x00c4
        L_0x00c2:
            r2 = r3
            goto L_0x00c5
        L_0x00c4:
            r2 = r4
        L_0x00c5:
            if (r2 == 0) goto L_0x00c9
            goto L_0x0128
        L_0x00c9:
            java.lang.String r0 = r0.mo119393w()
            java.lang.String r0 = com.carrefour.fid.android.domain.models.service.models.C38146a.m158072b(r0)
            kotlin.Result$a r2 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.models.service.models.StoreService r2 = r9.mo119354f()
            if (r2 == 0) goto L_0x00e1
            boolean r2 = com.carrefour.fid.android.service.domain.extension.StoreServiceKt.isDelivery(r2)
            if (r2 != r4) goto L_0x00e1
            r2 = r4
            goto L_0x00e2
        L_0x00e1:
            r2 = r3
        L_0x00e2:
            java.lang.String r5 = "PE"
            if (r2 == 0) goto L_0x00fc
            com.carrefour.fid.android.domain.models.service.models.StoreService r2 = r9.mo119354f()
            if (r2 == 0) goto L_0x00f1
            java.lang.String r2 = r2.mo119164H()
            goto L_0x00f2
        L_0x00f1:
            r2 = r1
        L_0x00f2:
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r5)
            if (r2 == 0) goto L_0x00fc
            com.carrefour.fid.android.domain.extension.C37505f.m153946c(r8, r0)
            goto L_0x0123
        L_0x00fc:
            com.carrefour.fid.android.domain.models.service.models.StoreService r2 = r9.mo119354f()
            if (r2 == 0) goto L_0x0109
            boolean r2 = com.carrefour.fid.android.service.domain.extension.StoreServiceKt.isDelivery(r2)
            if (r2 != r4) goto L_0x0109
            goto L_0x010a
        L_0x0109:
            r4 = r3
        L_0x010a:
            if (r4 == 0) goto L_0x0120
            com.carrefour.fid.android.domain.models.service.models.StoreService r9 = r9.mo119354f()
            if (r9 == 0) goto L_0x0116
            java.lang.String r1 = r9.mo119164H()
        L_0x0116:
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r5)
            if (r9 != 0) goto L_0x0120
            com.carrefour.fid.android.domain.extension.C37505f.m153944a(r8, r0)
            goto L_0x0123
        L_0x0120:
            com.carrefour.fid.android.domain.extension.C37505f.m153945b(r8, r0)
        L_0x0123:
            java.lang.Object r8 = kotlin.Result.m38702b(r8)
            goto L_0x015d
        L_0x0128:
            kotlin.Result$a r8 = kotlin.Result.f28060a
            com.carrefour.fid.android.core.io.OrderFeedbackThrowable r8 = new com.carrefour.fid.android.core.io.OrderFeedbackThrowable
            java.lang.String r9 = "no available store id"
            r8.<init>(r9)
            java.lang.Object r8 = kotlin.C11661u0.m45734a(r8)
            java.lang.Object r8 = kotlin.Result.m38702b(r8)
            goto L_0x015d
        L_0x013a:
            kotlin.Result$a r8 = kotlin.Result.f28060a
            com.carrefour.fid.android.core.io.OrderFeedbackThrowable r8 = new com.carrefour.fid.android.core.io.OrderFeedbackThrowable
            java.lang.String r9 = "service selection is null"
            r8.<init>(r9)
            java.lang.Object r8 = kotlin.C11661u0.m45734a(r8)
            java.lang.Object r8 = kotlin.Result.m38702b(r8)
            goto L_0x015d
        L_0x014c:
            kotlin.Result$a r8 = kotlin.Result.f28060a
            com.carrefour.fid.android.core.io.OrderFeedbackThrowable r8 = new com.carrefour.fid.android.core.io.OrderFeedbackThrowable
            java.lang.String r9 = "fail to get data"
            r8.<init>(r9)
            java.lang.Object r8 = kotlin.C11661u0.m45734a(r8)
            java.lang.Object r8 = kotlin.Result.m38702b(r8)
        L_0x015d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.feedback.OrderFeedbackUseCase.m172967invokegIAlus(com.carrefour.fid.android.domain.interactors.feedback.OrderFeedbackUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }
}
