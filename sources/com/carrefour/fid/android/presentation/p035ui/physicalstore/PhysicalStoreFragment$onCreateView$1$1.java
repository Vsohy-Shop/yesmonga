package com.carrefour.fid.android.presentation.p035ui.physicalstore;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.fragment.app.C19232h;
import androidx.navigation.NavController;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.p035ui.physicalstore.navigation.PhysicalStoreGraphKt;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.PhysicalStoreInfoViewModel;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.tracking.physicalstore.C29018a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreFragment$onCreateView$1$1 */
public final class PhysicalStoreFragment$onCreateView$1$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ PhysicalStoreFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhysicalStoreFragment$onCreateView$1$1(PhysicalStoreFragment physicalStoreFragment) {
        super(2);
        this.this$0 = physicalStoreFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    public final void invoke(@C12580l C8592o oVar, int i) {
        if ((i & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1568523746, i, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreFragment.onCreateView.<anonymous>.<anonymous> (PhysicalStoreFragment.kt:49)");
            }
            final PhysicalStoreFragment physicalStoreFragment = this.this$0;
            ThemeKt.m153788a(C8553b.m31048b(oVar, 1439929983, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                public final void invoke(@C12580l C8592o oVar, int i) {
                    int i2 = i;
                    if ((i2 & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(1439929983, i2, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (PhysicalStoreFragment.kt:50)");
                        }
                        C29018a R0 = physicalStoreFragment.mo73765R0();
                        C252841 r4 = r1;
                        final PhysicalStoreFragment physicalStoreFragment = physicalStoreFragment;
                        C252841 r1 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                physicalStoreFragment.mo73768U0();
                            }
                        };
                        C252872 r5 = r1;
                        final PhysicalStoreFragment physicalStoreFragment2 = physicalStoreFragment;
                        C252872 r12 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                physicalStoreFragment2.mo73766S0();
                            }
                        };
                        C252883 r6 = r1;
                        final PhysicalStoreFragment physicalStoreFragment3 = physicalStoreFragment;
                        C252883 r13 = new C11300l<String, C11079d2>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((String) obj);
                                return C11079d2.f28267a;
                            }

                            public final void invoke(@C12579k String str) {
                                Intrinsics.checkNotNullParameter(str, "url");
                                physicalStoreFragment3.mo73773Z0(str);
                            }
                        };
                        C252894 r7 = r1;
                        final PhysicalStoreFragment physicalStoreFragment4 = physicalStoreFragment;
                        C252894 r14 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                physicalStoreFragment4.mo73767T0();
                            }
                        };
                        C252905 r8 = r1;
                        final PhysicalStoreFragment physicalStoreFragment5 = physicalStoreFragment;
                        C252905 r15 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                NavController k;
                                C19232h activity = physicalStoreFragment5.getActivity();
                                BottomNavActivity bottomNavActivity = activity instanceof BottomNavActivity ? (BottomNavActivity) activity : null;
                                if (bottomNavActivity != null && (k = bottomNavActivity.mo83823k()) != null) {
                                    k.mo58128V(R.id.loyalty_graph);
                                }
                            }
                        };
                        C252916 r9 = r1;
                        final PhysicalStoreFragment physicalStoreFragment6 = physicalStoreFragment;
                        C252916 r16 = new C11300l<Integer, C11079d2>() {
                            /* renamed from: a */
                            public final void mo73784a(int i) {
                                physicalStoreFragment6.mo73769V0(i);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                mo73784a(((Number) obj).intValue());
                                return C11079d2.f28267a;
                            }
                        };
                        C252927 r10 = r1;
                        final PhysicalStoreFragment physicalStoreFragment7 = physicalStoreFragment;
                        C252927 r17 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                physicalStoreFragment7.mo73770W0();
                            }
                        };
                        C252938 r11 = r1;
                        final PhysicalStoreFragment physicalStoreFragment8 = physicalStoreFragment;
                        C252938 r18 = new C11300l<Boolean, C11079d2>() {
                            /* renamed from: a */
                            public final void mo73785a(boolean z) {
                                physicalStoreFragment8.mo73771X0(z);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                mo73785a(((Boolean) obj).booleanValue());
                                return C11079d2.f28267a;
                            }
                        };
                        C252949 r122 = r1;
                        final PhysicalStoreFragment physicalStoreFragment9 = physicalStoreFragment;
                        C252949 r19 = new C11305q<String, String, String, C11079d2>() {
                            /* renamed from: a */
                            public final void mo73786a(@C12579k String str, @C12579k String str2, @C12579k String str3) {
                                Intrinsics.checkNotNullParameter(str, "gameUrl");
                                Intrinsics.checkNotNullParameter(str2, "webViewTitle");
                                Intrinsics.checkNotNullParameter(str3, "secureTokenValue");
                                physicalStoreFragment9.mo73772Y0(str, str2, str3);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                mo73786a((String) obj, (String) obj2, (String) obj3);
                                return C11079d2.f28267a;
                            }
                        };
                        C2528510 r132 = r1;
                        final PhysicalStoreFragment physicalStoreFragment10 = physicalStoreFragment;
                        C2528510 r110 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                PhysicalStoreFragment physicalStoreFragment = physicalStoreFragment10;
                                NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
                                String string = physicalStoreFragment.getString(R.string.general_an_error_occurred);
                                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.general_an_error_occurred)");
                                FragmentKt.m118811B(physicalStoreFragment, variant, string, (String) null, (String) null, (C11289a) null, true, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2012, (Object) null);
                            }
                        };
                        C2528611 r142 = r1;
                        final PhysicalStoreFragment physicalStoreFragment11 = physicalStoreFragment;
                        C2528611 r111 = new C11300l<String, C11079d2>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((String) obj);
                                return C11079d2.f28267a;
                            }

                            public final void invoke(@C12579k String str) {
                                Intrinsics.checkNotNullParameter(str, "number");
                                physicalStoreFragment11.mo73774a1(str);
                            }
                        };
                        PhysicalStoreGraphKt.m109676a((PhysicalStoreInfoViewModel) null, R0, r4, r5, r6, r7, r8, r9, r10, r11, r122, r132, r142, oVar, 0, 0, 1);
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29843v0();
                            return;
                        }
                        return;
                    }
                    oVar.mo14958a0();
                }
            }), oVar, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
