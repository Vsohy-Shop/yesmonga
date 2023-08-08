package com.carrefour.fid.android.presentation.p035ui.checkout.p036al.screen;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.C2455e;
import androidx.compose.material.C7933t0;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.theme.C37477d;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.domain.models.service.models.StoreAddress;
import com.carrefour.fid.android.presentation.p035ui.checkout.common.BlockDividerKt;
import com.carrefour.fid.android.presentation.p035ui.checkout.p036al.component.SectionKt;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step2.state.C26102a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/foundation/lazy/e;", "Lkotlin/d2;", "invoke", "(Landroidx/compose/foundation/lazy/e;Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nCheckoutStep2Screen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutStep2Screen.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/screen/CheckoutStep2ScreenKt$serviceSection$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,739:1\n154#2:740\n154#2:741\n*S KotlinDebug\n*F\n+ 1 CheckoutStep2Screen.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/screen/CheckoutStep2ScreenKt$serviceSection$1\n*L\n274#1:740\n288#1:741\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep2ScreenKt$serviceSection$1 */
public final class CheckoutStep2ScreenKt$serviceSection$1 extends Lambda implements C11305q<C2455e, C8592o, Integer, C11079d2> {
    final /* synthetic */ C26102a $serviceState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep2ScreenKt$serviceSection$1(C26102a aVar) {
        super(3);
        this.$serviceState = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2455e) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12579k C2455e eVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(eVar, "$this$item");
        if ((i & 81) != 16 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(454849970, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.screen.serviceSection.<anonymous> (CheckoutStep2Screen.kt:267)");
            }
            BlockDividerKt.m104587a(oVar, 0);
            C26102a aVar = this.$serviceState;
            if (aVar instanceof C26102a.C26103a) {
                oVar.mo14918M(1910833067);
                C8767m n = SizeKt.m10114n(PaddingKt.m10024k(C8767m.f23478j, C16483g.m74435M((float) 16)), 0.0f, 1, (Object) null);
                String d = C16018i.m71858d(R.string.checkout_service_delivery, oVar, 0);
                final C26102a aVar2 = this.$serviceState;
                SectionKt.m104223a(n, d, C8553b.m31048b(oVar, -493960670, true, new C11304p<C8592o, Integer, C11079d2>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((C8592o) obj, ((Number) obj2).intValue());
                        return C11079d2.f28267a;
                    }

                    @C8540g
                    @C8570j(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(@C12580l C8592o oVar, int i) {
                        int i2 = i;
                        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
                            if (ComposerKt.m29813g0()) {
                                ComposerKt.m29845w0(-493960670, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.screen.serviceSection.<anonymous>.<anonymous> (CheckoutStep2Screen.kt:276)");
                            }
                            Address e = ((C26102a.C26103a) aVar2).mo75794e();
                            String y = e != null ? e.mo116725y() : null;
                            if (y == null) {
                                y = "";
                            }
                            TextKt.m14196c(y, (C8767m) null, 0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153890b(C7933t0.f19075a.mo11077c(oVar, C7933t0.f19076b)), oVar, 0, 0, 65534);
                            if (ComposerKt.m29813g0()) {
                                ComposerKt.m29843v0();
                                return;
                            }
                            return;
                        }
                        oVar.mo14958a0();
                    }
                }), oVar, 390, 0);
                oVar.mo15002m0();
            } else if (aVar instanceof C26102a.C26104b) {
                oVar.mo14918M(1910833601);
                C8767m n2 = SizeKt.m10114n(PaddingKt.m10024k(C8767m.f23478j, C16483g.m74435M((float) 16)), 0.0f, 1, (Object) null);
                String d2 = C16018i.m71858d(R.string.checkout_service_drive, oVar, 0);
                final C26102a aVar3 = this.$serviceState;
                SectionKt.m104223a(n2, d2, C8553b.m31048b(oVar, -206634165, true, new C11304p<C8592o, Integer, C11079d2>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((C8592o) obj, ((Number) obj2).intValue());
                        return C11079d2.f28267a;
                    }

                    @C8540g
                    @C8570j(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(@C12580l C8592o oVar, int i) {
                        String str;
                        int i2 = i;
                        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
                            if (ComposerKt.m29813g0()) {
                                ComposerKt.m29845w0(-206634165, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.screen.serviceSection.<anonymous>.<anonymous> (CheckoutStep2Screen.kt:290)");
                            }
                            StoreAddress d = ((C26102a.C26104b) aVar3).mo75801d();
                            if (d != null) {
                                String h = d.mo119126h();
                                String i3 = d.mo119128i();
                                String l = d.mo119131l();
                                String j = d.mo119129j();
                                str = StringsKt__StringsKt.trim(h + " " + i3 + "\n" + l + " " + j).toString();
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                str = "";
                            }
                            TextKt.m14196c(str, (C8767m) null, 0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153890b(C7933t0.f19075a.mo11077c(oVar, C7933t0.f19076b)), oVar, 0, 0, 65534);
                            if (ComposerKt.m29813g0()) {
                                ComposerKt.m29843v0();
                                return;
                            }
                            return;
                        }
                        oVar.mo14958a0();
                    }
                }), oVar, 390, 0);
                oVar.mo15002m0();
            } else {
                oVar.mo14918M(1910834208);
                oVar.mo15002m0();
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
