package com.carrefour.fid.android.consent.domain.interactors;

import com.carrefour.fid.android.domain.interactors.consent.C37629a;
import com.carrefour.fid.android.domain.interactors.consent.C37630b;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002HBø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/consent/domain/interactors/ConsentGetRefusedAndMissingConsentsUseCase;", "Lcom/carrefour/fid/android/domain/interactors/consent/b;", "Lkotlin/Result;", "", "Lcom/carrefour/fid/android/domain/models/consent/ConsentOptIn;", "invoke-IoAF18A", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "invoke", "Lcom/carrefour/fid/android/domain/interactors/consent/a;", "getConsentsUseCase", "Lcom/carrefour/fid/android/domain/interactors/consent/a;", "Lcom/carrefour/fid/android/domain/interactors/user/e;", "getUserInfoUseCase", "Lcom/carrefour/fid/android/domain/interactors/user/e;", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/consent/a;Lcom/carrefour/fid/android/domain/interactors/user/e;)V", "consent_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nConsentGetRefusedAndMissingConsentsUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsentGetRefusedAndMissingConsentsUseCase.kt\ncom/carrefour/fid/android/consent/domain/interactors/ConsentGetRefusedAndMissingConsentsUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n288#2,2:53\n1549#2:55\n1620#2,3:56\n766#2:59\n857#2,2:60\n766#2:62\n857#2,2:63\n1549#2:65\n1620#2,3:66\n*S KotlinDebug\n*F\n+ 1 ConsentGetRefusedAndMissingConsentsUseCase.kt\ncom/carrefour/fid/android/consent/domain/interactors/ConsentGetRefusedAndMissingConsentsUseCase\n*L\n22#1:53,2\n28#1:55\n28#1:56,3\n29#1:59\n29#1:60,2\n30#1:62\n30#1:63,2\n32#1:65\n32#1:66,3\n*E\n"})
public final class ConsentGetRefusedAndMissingConsentsUseCase implements C37630b {
    @C12579k
    private final C37629a getConsentsUseCase;
    @C12579k
    private final C37878e getUserInfoUseCase;

    @Inject
    public ConsentGetRefusedAndMissingConsentsUseCase(@C12579k C37629a aVar, @C12579k C37878e eVar) {
        Intrinsics.checkNotNullParameter(aVar, "getConsentsUseCase");
        Intrinsics.checkNotNullParameter(eVar, "getUserInfoUseCase");
        this.getConsentsUseCase = aVar;
        this.getUserInfoUseCase = eVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: com.carrefour.fid.android.domain.models.account.Phone} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x009e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172921invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.consent.ConsentOptIn>>> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.carrefour.fid.android.consent.domain.interactors.ConsentGetRefusedAndMissingConsentsUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.carrefour.fid.android.consent.domain.interactors.ConsentGetRefusedAndMissingConsentsUseCase$invoke$1 r0 = (com.carrefour.fid.android.consent.domain.interactors.ConsentGetRefusedAndMissingConsentsUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.consent.domain.interactors.ConsentGetRefusedAndMissingConsentsUseCase$invoke$1 r0 = new com.carrefour.fid.android.consent.domain.interactors.ConsentGetRefusedAndMissingConsentsUseCase$invoke$1
            r0.<init>(r12, r13)
        L_0x0018:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0051
            if (r2 == r4) goto L_0x0043
            if (r2 != r3) goto L_0x003b
            java.lang.Object r1 = r0.L$1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.L$0
            java.lang.String r0 = (java.lang.String) r0
            kotlin.C11661u0.m45747n(r13)
            kotlin.Result r13 = (kotlin.Result) r13
            java.lang.Object r13 = r13.mo21858l()
            goto L_0x00c5
        L_0x003b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0043:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.consent.domain.interactors.ConsentGetRefusedAndMissingConsentsUseCase r2 = (com.carrefour.fid.android.consent.domain.interactors.ConsentGetRefusedAndMissingConsentsUseCase) r2
            kotlin.C11661u0.m45747n(r13)
            kotlin.Result r13 = (kotlin.Result) r13
            java.lang.Object r13 = r13.mo21858l()
            goto L_0x0064
        L_0x0051:
            kotlin.C11661u0.m45747n(r13)
            com.carrefour.fid.android.domain.interactors.user.e r13 = r12.getUserInfoUseCase
            com.carrefour.fid.android.domain.interactors.user.e$a r2 = com.carrefour.fid.android.domain.interactors.user.C37878e.C37879a.f94997a
            r0.L$0 = r12
            r0.label = r4
            java.lang.Object r13 = r13.m172966invokegIAlus(r2, r0)
            if (r13 != r1) goto L_0x0063
            return r1
        L_0x0063:
            r2 = r12
        L_0x0064:
            boolean r5 = kotlin.Result.m38709i(r13)
            r6 = 0
            if (r5 == 0) goto L_0x006c
            r13 = r6
        L_0x006c:
            com.carrefour.fid.android.domain.models.account.AccountInfo r13 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r13
            if (r13 == 0) goto L_0x0075
            java.lang.String r5 = r13.mo116663r()
            goto L_0x0076
        L_0x0075:
            r5 = r6
        L_0x0076:
            java.lang.String r7 = ""
            if (r5 != 0) goto L_0x007b
            r5 = r7
        L_0x007b:
            if (r13 == 0) goto L_0x00b1
            java.util.List r13 = r13.mo116671x()
            if (r13 == 0) goto L_0x00b1
            r8 = r13
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L_0x008a:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x009e
            java.lang.Object r9 = r8.next()
            r10 = r9
            com.carrefour.fid.android.domain.models.account.Phone r10 = (com.carrefour.fid.android.domain.models.account.Phone) r10
            boolean r10 = r10.mo116743f()
            if (r10 == 0) goto L_0x008a
            goto L_0x009f
        L_0x009e:
            r9 = r6
        L_0x009f:
            com.carrefour.fid.android.domain.models.account.Phone r9 = (com.carrefour.fid.android.domain.models.account.Phone) r9
            if (r9 != 0) goto L_0x00aa
            java.lang.Object r13 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r13)
            r9 = r13
            com.carrefour.fid.android.domain.models.account.Phone r9 = (com.carrefour.fid.android.domain.models.account.Phone) r9
        L_0x00aa:
            if (r9 == 0) goto L_0x00b1
            java.lang.String r13 = r9.mo116741e()
            r6 = r13
        L_0x00b1:
            if (r6 != 0) goto L_0x00b4
            r6 = r7
        L_0x00b4:
            com.carrefour.fid.android.domain.interactors.consent.a r13 = r2.getConsentsUseCase
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r13 = r13.m172965invokeIoAF18A(r0)
            if (r13 != r1) goto L_0x00c3
            return r1
        L_0x00c3:
            r0 = r5
            r1 = r6
        L_0x00c5:
            java.lang.Throwable r2 = kotlin.Result.m38705e(r13)
            if (r2 != 0) goto L_0x0194
            java.util.List r13 = (java.util.List) r13
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r5 = kotlin.collections.C10978t.m41495Y(r13, r3)
            r2.<init>(r5)
            java.util.Iterator r5 = r13.iterator()
        L_0x00de:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00f2
            java.lang.Object r6 = r5.next()
            com.carrefour.fid.android.domain.models.consent.ConsentOptIn r6 = (com.carrefour.fid.android.domain.models.consent.ConsentOptIn) r6
            com.carrefour.fid.android.domain.models.consent.ConsentName r6 = r6.mo117326h()
            r2.add(r6)
            goto L_0x00de
        L_0x00f2:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r13 = r13.iterator()
        L_0x00fb:
            boolean r6 = r13.hasNext()
            if (r6 == 0) goto L_0x0119
            java.lang.Object r6 = r13.next()
            r7 = r6
            com.carrefour.fid.android.domain.models.consent.ConsentOptIn r7 = (com.carrefour.fid.android.domain.models.consent.ConsentOptIn) r7
            com.carrefour.fid.android.domain.models.consent.ChoiceOptIn r7 = r7.mo117324f()
            com.carrefour.fid.android.domain.models.consent.ChoiceOptIn r8 = com.carrefour.fid.android.domain.models.consent.ChoiceOptIn.REFUSED
            if (r7 != r8) goto L_0x0112
            r7 = r4
            goto L_0x0113
        L_0x0112:
            r7 = 0
        L_0x0113:
            if (r7 == 0) goto L_0x00fb
            r5.add(r6)
            goto L_0x00fb
        L_0x0119:
            java.util.List r13 = com.carrefour.fid.android.domain.models.consent.extension.C37997a.m156417c()
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r13 = r13.iterator()
        L_0x0128:
            boolean r7 = r13.hasNext()
            if (r7 == 0) goto L_0x0140
            java.lang.Object r7 = r13.next()
            r8 = r7
            com.carrefour.fid.android.domain.models.consent.ConsentName r8 = (com.carrefour.fid.android.domain.models.consent.ConsentName) r8
            boolean r8 = r2.contains(r8)
            r8 = r8 ^ r4
            if (r8 == 0) goto L_0x0128
            r6.add(r7)
            goto L_0x0128
        L_0x0140:
            java.util.ArrayList r13 = new java.util.ArrayList
            int r2 = kotlin.collections.C10978t.m41495Y(r6, r3)
            r13.<init>(r2)
            java.util.Iterator r2 = r6.iterator()
        L_0x014d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0169
            java.lang.Object r3 = r2.next()
            r7 = r3
            com.carrefour.fid.android.domain.models.consent.ConsentName r7 = (com.carrefour.fid.android.domain.models.consent.ConsentName) r7
            com.carrefour.fid.android.domain.models.consent.ConsentOptIn r3 = new com.carrefour.fid.android.domain.models.consent.ConsentOptIn
            com.carrefour.fid.android.domain.models.consent.ChoiceOptIn r8 = com.carrefour.fid.android.domain.models.consent.ChoiceOptIn.NO_SPECIFIED
            r9 = 0
            r10 = 4
            r11 = 0
            r6 = r3
            r6.<init>(r7, r8, r9, r10, r11)
            r13.add(r3)
            goto L_0x014d
        L_0x0169:
            java.util.List r2 = kotlin.collections.C10976s.m41417i()
            r2.addAll(r5)
            r2.addAll(r13)
            boolean r13 = kotlin.text.C11622t.isBlank(r0)
            if (r13 == 0) goto L_0x017e
            com.carrefour.fid.android.consent.domain.interactors.ConsentGetRefusedAndMissingConsentsUseCase$invoke$2$missingOptIns$1$1 r13 = com.carrefour.fid.android.consent.domain.interactors.C36110x22ba56a6.INSTANCE
            kotlin.collections.C10994x.m42348I0(r2, r13)
        L_0x017e:
            boolean r13 = kotlin.text.C11622t.isBlank(r1)
            if (r13 == 0) goto L_0x0189
            com.carrefour.fid.android.consent.domain.interactors.ConsentGetRefusedAndMissingConsentsUseCase$invoke$2$missingOptIns$1$2 r13 = com.carrefour.fid.android.consent.domain.interactors.C36111x22ba56a7.INSTANCE
            kotlin.collections.C10994x.m42348I0(r2, r13)
        L_0x0189:
            java.util.List r13 = kotlin.collections.C10976s.m41409a(r2)
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r13 = kotlin.Result.m38702b(r13)
            goto L_0x019e
        L_0x0194:
            kotlin.Result$a r13 = kotlin.Result.f28060a
            java.lang.Object r13 = kotlin.C11661u0.m45734a(r2)
            java.lang.Object r13 = kotlin.Result.m38702b(r13)
        L_0x019e:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.consent.domain.interactors.ConsentGetRefusedAndMissingConsentsUseCase.m172921invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
