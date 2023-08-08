package com.carrefour.fid.android.scan.domain.interactors;

import com.carrefour.fid.android.scan.core.EmptyBarcodeException;
import com.carrefour.fid.android.scan.domain.interactors.ExtractScannedDataUseCase;
import com.carrefour.fid.android.shared.util.C28935i;
import com.google.mlkit.vision.barcode.C33982a;
import java.util.Iterator;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.collections.C10976s;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C12072o;

@C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052*\u0010\u0004\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo22516d2 = {"", "Lcom/google/mlkit/vision/barcode/a;", "kotlin.jvm.PlatformType", "", "list", "Lkotlin/d2;", "a", "(Ljava/util/List;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nExtractScannedDataUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExtractScannedDataUseCase.kt\ncom/carrefour/fid/android/scan/domain/interactors/ExtractScannedDataUseCase$invoke$2$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,81:1\n288#2,2:82\n288#2,2:84\n*S KotlinDebug\n*F\n+ 1 ExtractScannedDataUseCase.kt\ncom/carrefour/fid/android/scan/domain/interactors/ExtractScannedDataUseCase$invoke$2$1$2\n*L\n48#1:82,2\n54#1:84,2\n*E\n"})
public final class ExtractScannedDataUseCase$invoke$2$1$2 extends Lambda implements C11300l<List<C33982a>, C11079d2> {
    final /* synthetic */ C12072o<Result<String>> $continuation;
    final /* synthetic */ ExtractScannedDataUseCase.C28271a $param;

    /* renamed from: com.carrefour.fid.android.scan.domain.interactors.ExtractScannedDataUseCase$invoke$2$1$2$a */
    public /* synthetic */ class C28275a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.carrefour.fid.android.scan.core.constants.ScanType[] r0 = com.carrefour.fid.android.scan.core.constants.ScanType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.scan.core.constants.ScanType r1 = com.carrefour.fid.android.scan.core.constants.ScanType.PRODUCT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.scan.core.constants.ScanType r1 = com.carrefour.fid.android.scan.core.constants.ScanType.LOYALTY_CARD     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.scan.domain.interactors.ExtractScannedDataUseCase$invoke$2$1$2.C28275a.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExtractScannedDataUseCase$invoke$2$1$2(ExtractScannedDataUseCase.C28271a aVar, C12072o<? super Result<String>> oVar) {
        super(1);
        this.$param = aVar;
        this.$continuation = oVar;
    }

    /* renamed from: a */
    public final void mo82232a(List<C33982a> list) {
        C33982a aVar;
        String l;
        Object obj;
        Object obj2;
        C28935i.m119704b(C28935i.f70940a, "Scanned code list : " + list.size(), (Throwable) null, 0, 6, (Object) null);
        int i = C28275a.$EnumSwitchMapping$0[this.$param.mo82225f().ordinal()];
        C11079d2 d2Var = null;
        if (i == 1) {
            Intrinsics.checkNotNullExpressionValue(list, "list");
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (CollectionsKt__CollectionsKt.m40448L(32, 5).contains(Integer.valueOf(((C33982a) obj).mo98845h()))) {
                    break;
                }
            }
            aVar = (C33982a) obj;
        } else if (i == 2) {
            Intrinsics.checkNotNullExpressionValue(list, "list");
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (C10976s.m41419k(1).contains(Integer.valueOf(((C33982a) obj2).mo98845h()))) {
                    break;
                }
            }
            aVar = (C33982a) obj2;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (!(aVar == null || (l = aVar.mo98849l()) == null)) {
            C12072o<Result<String>> oVar = this.$continuation;
            Result.C10852a aVar2 = Result.f28060a;
            oVar.resumeWith(Result.m38702b(Result.m38701a(Result.m38702b(l))));
            d2Var = C11079d2.f28267a;
        }
        if (d2Var == null) {
            C12072o<Result<String>> oVar2 = this.$continuation;
            Result.C10852a aVar3 = Result.f28060a;
            oVar2.resumeWith(Result.m38702b(Result.m38701a(Result.m38702b(C11661u0.m45734a(EmptyBarcodeException.f68396a)))));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo82232a((List) obj);
        return C11079d2.f28267a;
    }
}
