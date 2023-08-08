package com.carrefour.fid.android.service.presentation.p044ui.delivery.screen;

import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.service.presentation.model.DeliveryType;
import com.carrefour.fid.android.service.presentation.p044ui.delivery.DeliverySummaryAction;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nDeliverySummaryStateful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeliverySummaryStateful.kt\ncom/carrefour/fid/android/service/presentation/ui/delivery/screen/DeliverySummaryStatefulKt$DeliverySummaryScreen$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,298:1\n36#2:299\n1114#3,6:300\n*S KotlinDebug\n*F\n+ 1 DeliverySummaryStateful.kt\ncom/carrefour/fid/android/service/presentation/ui/delivery/screen/DeliverySummaryStatefulKt$DeliverySummaryScreen$2\n*L\n145#1:299\n145#1:300,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.screen.DeliverySummaryStatefulKt$DeliverySummaryScreen$2 */
public final class DeliverySummaryStatefulKt$DeliverySummaryScreen$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11300l<DeliverySummaryAction, C11079d2> $actioner;
    final /* synthetic */ DeliveryType $deliveryType;

    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.screen.DeliverySummaryStatefulKt$DeliverySummaryScreen$2$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.carrefour.fid.android.service.presentation.model.DeliveryType[] r0 = com.carrefour.fid.android.service.presentation.model.DeliveryType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.service.presentation.model.DeliveryType r1 = com.carrefour.fid.android.service.presentation.model.DeliveryType.Clcv     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.service.presentation.model.DeliveryType r1 = com.carrefour.fid.android.service.presentation.model.DeliveryType.H1h3     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.presentation.p044ui.delivery.screen.DeliverySummaryStatefulKt$DeliverySummaryScreen$2.WhenMappings.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeliverySummaryStatefulKt$DeliverySummaryScreen$2(DeliveryType deliveryType, C11300l<? super DeliverySummaryAction, C11079d2> lVar, int i) {
        super(2);
        this.$deliveryType = deliveryType;
        this.$actioner = lVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(@org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r16, int r17) {
        /*
            r15 = this;
            r0 = r15
            r12 = r16
            r1 = r17
            r2 = r1 & 11
            r3 = 2
            if (r2 != r3) goto L_0x0015
            boolean r2 = r16.mo15011p()
            if (r2 != 0) goto L_0x0011
            goto L_0x0015
        L_0x0011:
            r16.mo14958a0()
            goto L_0x0086
        L_0x0015:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0024
            r2 = -1
            java.lang.String r4 = "com.carrefour.fid.android.service.presentation.ui.delivery.screen.DeliverySummaryScreen.<anonymous> (DeliverySummaryStateful.kt:136)"
            r5 = -1544009862(0xffffffffa3f8477a, float:-2.6918485E-17)
            androidx.compose.runtime.ComposerKt.m29845w0(r5, r1, r2, r4)
        L_0x0024:
            com.carrefour.fid.android.service.presentation.model.DeliveryType r1 = r0.$deliveryType
            int[] r2 = com.carrefour.fid.android.service.presentation.p044ui.delivery.screen.DeliverySummaryStatefulKt$DeliverySummaryScreen$2.WhenMappings.$EnumSwitchMapping$0
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 1
            if (r1 == r2) goto L_0x003c
            if (r1 != r3) goto L_0x0036
            int r1 = com.carrefour.fid.android.service.C28330R.string.delivery_service_summary_h1h3
            goto L_0x003e
        L_0x0036:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L_0x003c:
            int r1 = com.carrefour.fid.android.service.C28330R.string.delivery_service_summary_clcv
        L_0x003e:
            r2 = 0
            java.lang.String r1 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r12, r2)
            r2 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            kotlin.jvm.functions.l<com.carrefour.fid.android.service.presentation.ui.delivery.DeliverySummaryAction, kotlin.d2> r11 = r0.$actioner
            r13 = 1157296644(0x44faf204, float:2007.563)
            r12.mo14918M(r13)
            boolean r13 = r12.mo15006n0(r11)
            java.lang.Object r14 = r16.mo14921N()
            if (r13 != 0) goto L_0x0066
            androidx.compose.runtime.o$a r13 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r13 = r13.mo16277a()
            if (r14 != r13) goto L_0x006e
        L_0x0066:
            com.carrefour.fid.android.service.presentation.ui.delivery.screen.DeliverySummaryStatefulKt$DeliverySummaryScreen$2$1$1 r14 = new com.carrefour.fid.android.service.presentation.ui.delivery.screen.DeliverySummaryStatefulKt$DeliverySummaryScreen$2$1$1
            r14.<init>(r11)
            r12.mo14893C(r14)
        L_0x006e:
            r16.mo15002m0()
            r11 = r14
            kotlin.jvm.functions.a r11 = (kotlin.jvm.functions.C11289a) r11
            r13 = 1572864(0x180000, float:2.204052E-39)
            r14 = 62
            r12 = r16
            com.carrefour.fid.android.design.components.compose.HeaderComponentKt.m151505j(r1, r2, r3, r5, r7, r9, r10, r11, r12, r13, r14)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0086
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0086:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.presentation.p044ui.delivery.screen.DeliverySummaryStatefulKt$DeliverySummaryScreen$2.invoke(androidx.compose.runtime.o, int):void");
    }
}
