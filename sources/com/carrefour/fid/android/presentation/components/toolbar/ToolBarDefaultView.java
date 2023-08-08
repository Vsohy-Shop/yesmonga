package com.carrefour.fid.android.presentation.components.toolbar;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.C0324b1;
import androidx.appcompat.app.C0475e;
import androidx.appcompat.widget.C0696c;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.content.C17318d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.categories.presentation.p067ui.department.C39785g;
import com.carrefour.fid.android.categories.presentation.p067ui.department.DepartmentFragment;
import com.carrefour.fid.android.databinding.C36767m8;
import com.carrefour.fid.android.design.components.extension.ViewKt;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.p035ui.environment.AppEnvironmentSelectionFragment;
import com.carrefour.fid.android.presentation.p035ui.home.C24142f;
import com.carrefour.fid.android.presentation.p035ui.home.HomePageFragment;
import com.carrefour.fid.android.presentation.p035ui.product.search.ProductSearchFragment;
import com.carrefour.fid.android.shared.extension.C28775q;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000k\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001,\b\u0007\u0018\u00002\u00020\u0001:\u00015B'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100\u0012\b\b\u0002\u00102\u001a\u00020!¢\u0006\u0004\b3\u00104J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007H\u0016J7\u0010\u0012\u001a\u00020\u00022\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f2\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00020\f¢\u0006\u0002\b\u0010J\u0016\u0010\u0015\u001a\u00020\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0007J&\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00072\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0002\u0018\u00010\fJ0\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00072\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f2\b\b\u0002\u0010\u0019\u001a\u00020\u0007J&\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0002\u0018\u00010\fJ\"\u0010#\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\"\u001a\u00020!J\u0010\u0010%\u001a\u00020\u00022\b\b\u0001\u0010$\u001a\u00020!J\u001a\u0010'\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010&\u001a\u00020!R\u0014\u0010+\u001a\u00020(8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00066"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/components/toolbar/ToolBarDefaultView;", "Landroidx/appcompat/widget/Toolbar;", "Lkotlin/d2;", "d0", "e0", "Landroid/content/Context;", "context", "", "isLightAppBar", "t0", "enabled", "setEnabled", "Lkotlin/Function1;", "Landroid/view/View;", "onScanAction", "Lcom/carrefour/fid/android/presentation/components/toolbar/a;", "Lkotlin/t;", "settingsCreator", "setup", "Lkotlin/Function0;", "action", "setupDeleteButton", "isVisible", "u0", "onBackAction", "changeDrawable", "q0", "Landroidx/appcompat/app/e;", "activity", "g0", "", "title", "subtitle", "", "titleColor", "n0", "resourceId", "k0", "color", "l0", "Lcom/carrefour/fid/android/databinding/m8;", "n1", "Lcom/carrefour/fid/android/databinding/m8;", "binding", "com/carrefour/fid/android/presentation/components/toolbar/ToolBarDefaultView$b", "o1", "Lcom/carrefour/fid/android/presentation/components/toolbar/ToolBarDefaultView$b;", "editToolbarHomeAccountSearchWatcher", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nToolBarDefaultView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ToolBarDefaultView.kt\ncom/carrefour/fid/android/presentation/components/toolbar/ToolBarDefaultView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,349:1\n262#2,2:350\n262#2,2:353\n1#3:352\n*S KotlinDebug\n*F\n+ 1 ToolBarDefaultView.kt\ncom/carrefour/fid/android/presentation/components/toolbar/ToolBarDefaultView\n*L\n136#1:350,2\n149#1:353,2\n*E\n"})
public final class ToolBarDefaultView extends Toolbar {

    /* renamed from: p1 */
    public static final int f97219p1 = 8;
    @C12579k

    /* renamed from: n1 */
    public final C36767m8 f97220n1;
    @C12579k

    /* renamed from: o1 */
    public final C38406b f97221o1;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView$a */
    public static abstract class C38391a {

        /* renamed from: a */
        public static final int f97222a = 0;

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView$a$a */
        public static final class C38392a extends C38391a {
            @C12579k

            /* renamed from: b */
            public static final C38392a f97223b = new C38392a();

            /* renamed from: c */
            public static final int f97224c = 0;

            public C38392a() {
                super((DefaultConstructorMarker) null);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView$a$b */
        public static final class C38393b extends C38391a {
            @C12579k

            /* renamed from: b */
            public static final C38393b f97225b = new C38393b();

            /* renamed from: c */
            public static final int f97226c = 0;

            public C38393b() {
                super((DefaultConstructorMarker) null);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView$a$c */
        public static final class C38394c extends C38391a {
            @C12579k

            /* renamed from: b */
            public static final C38394c f97227b = new C38394c();

            /* renamed from: c */
            public static final int f97228c = 0;

            public C38394c() {
                super((DefaultConstructorMarker) null);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView$a$d */
        public static final class C38395d extends C38391a {
            @C12579k

            /* renamed from: b */
            public static final C38395d f97229b = new C38395d();

            /* renamed from: c */
            public static final int f97230c = 0;

            public C38395d() {
                super((DefaultConstructorMarker) null);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView$a$e */
        public static final class C38396e extends C38391a {
            @C12579k

            /* renamed from: b */
            public static final C38396e f97231b = new C38396e();

            /* renamed from: c */
            public static final int f97232c = 0;

            public C38396e() {
                super((DefaultConstructorMarker) null);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView$a$f */
        public static final class C38397f extends C38391a {
            @C12579k

            /* renamed from: b */
            public static final C38397f f97233b = new C38397f();

            /* renamed from: c */
            public static final int f97234c = 0;

            public C38397f() {
                super((DefaultConstructorMarker) null);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView$a$g */
        public static final class C38398g extends C38391a {
            @C12579k

            /* renamed from: b */
            public static final C38398g f97235b = new C38398g();

            /* renamed from: c */
            public static final int f97236c = 0;

            public C38398g() {
                super((DefaultConstructorMarker) null);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView$a$h */
        public static final class C38399h extends C38391a {

            /* renamed from: c */
            public static final int f97237c = 8;
            @C12579k

            /* renamed from: b */
            public final C0475e f97238b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C38399h(@C12579k C0475e eVar) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(eVar, C0696c.f2306r);
                this.f97238b = eVar;
            }

            /* renamed from: c */
            public static /* synthetic */ C38399h m158957c(C38399h hVar, C0475e eVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    eVar = hVar.f97238b;
                }
                return hVar.mo121288b(eVar);
            }

            @C12579k
            /* renamed from: a */
            public final C0475e mo121287a() {
                return this.f97238b;
            }

            @C12579k
            /* renamed from: b */
            public final C38399h mo121288b(@C12579k C0475e eVar) {
                Intrinsics.checkNotNullParameter(eVar, C0696c.f2306r);
                return new C38399h(eVar);
            }

            @C12579k
            /* renamed from: d */
            public final C0475e mo121289d() {
                return this.f97238b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C38399h) && Intrinsics.areEqual((Object) this.f97238b, (Object) ((C38399h) obj).f97238b);
            }

            public int hashCode() {
                return this.f97238b.hashCode();
            }

            @C12579k
            public String toString() {
                C0475e eVar = this.f97238b;
                return "DEPARTMENTS(activity=" + eVar + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView$a$i */
        public static final class C38400i extends C38391a {
            @C12579k

            /* renamed from: b */
            public static final C38400i f97239b = new C38400i();

            /* renamed from: c */
            public static final int f97240c = 0;

            public C38400i() {
                super((DefaultConstructorMarker) null);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView$a$j */
        public static final class C38401j extends C38391a {
            @C12579k

            /* renamed from: b */
            public static final C38401j f97241b = new C38401j();

            /* renamed from: c */
            public static final int f97242c = 0;

            public C38401j() {
                super((DefaultConstructorMarker) null);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView$a$k */
        public static final class C38402k extends C38391a {
            @C12579k

            /* renamed from: b */
            public static final C38402k f97243b = new C38402k();

            /* renamed from: c */
            public static final int f97244c = 0;

            public C38402k() {
                super((DefaultConstructorMarker) null);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView$a$l */
        public static final class C38403l extends C38391a {
            @C12579k

            /* renamed from: b */
            public static final C38403l f97245b = new C38403l();

            /* renamed from: c */
            public static final int f97246c = 0;

            public C38403l() {
                super((DefaultConstructorMarker) null);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView$a$m */
        public static final class C38404m extends C38391a {
            @C12579k

            /* renamed from: b */
            public static final C38404m f97247b = new C38404m();

            /* renamed from: c */
            public static final int f97248c = 0;

            public C38404m() {
                super((DefaultConstructorMarker) null);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView$a$n */
        public static final class C38405n extends C38391a {

            /* renamed from: c */
            public static final int f97249c = 8;
            @C12579k

            /* renamed from: b */
            public final C0475e f97250b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C38405n(@C12579k C0475e eVar) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(eVar, C0696c.f2306r);
                this.f97250b = eVar;
            }

            /* renamed from: c */
            public static /* synthetic */ C38405n m158961c(C38405n nVar, C0475e eVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    eVar = nVar.f97250b;
                }
                return nVar.mo121294b(eVar);
            }

            @C12579k
            /* renamed from: a */
            public final C0475e mo121293a() {
                return this.f97250b;
            }

            @C12579k
            /* renamed from: b */
            public final C38405n mo121294b(@C12579k C0475e eVar) {
                Intrinsics.checkNotNullParameter(eVar, C0696c.f2306r);
                return new C38405n(eVar);
            }

            @C12579k
            /* renamed from: d */
            public final C0475e mo121295d() {
                return this.f97250b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C38405n) && Intrinsics.areEqual((Object) this.f97250b, (Object) ((C38405n) obj).f97250b);
            }

            public int hashCode() {
                return this.f97250b.hashCode();
            }

            @C12579k
            public String toString() {
                C0475e eVar = this.f97250b;
                return "WALL(activity=" + eVar + ")";
            }
        }

        public /* synthetic */ C38391a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C38391a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView$b */
    public static final class C38406b implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ ToolBarDefaultView f97251a;

        public C38406b(ToolBarDefaultView toolBarDefaultView) {
            this.f97251a = toolBarDefaultView;
        }

        public void afterTextChanged(@C12580l Editable editable) {
            boolean z;
            ImageButton imageButton = this.f97251a.f97220n1.f91338d;
            if (editable == null || C11622t.isBlank(editable)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Intrinsics.checkNotNullExpressionValue(imageButton, "afterTextChanged$lambda$0");
                ViewKt.m152126h(imageButton, Integer.valueOf(R.anim.fade_out_scaled), 0, false, (C11289a) null, 14, (Object) null);
                return;
            }
            Intrinsics.checkNotNullExpressionValue(imageButton, "afterTextChanged$lambda$0");
            ViewKt.m152123e(imageButton, Integer.valueOf(R.anim.fade_in_scaled), false, (C11289a) null, 6, (Object) null);
        }

        public void beforeTextChanged(@C12580l CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(@C12580l CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ToolBarDefaultView(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: a0 */
    public static final void m158934a0(C0475e eVar, View view) {
        Intrinsics.checkNotNullParameter(eVar, "$activity");
        view.setEnabled(false);
        eVar.onBackPressed();
    }

    /* renamed from: b0 */
    public static final void m158935b0(ToolBarDefaultView toolBarDefaultView, View view) {
        Intrinsics.checkNotNullParameter(toolBarDefaultView, "this$0");
        toolBarDefaultView.f97220n1.f91339e.getText().clear();
    }

    /* renamed from: f0 */
    public static final boolean m158937f0(C0475e eVar, View view) {
        Intrinsics.checkNotNullParameter(eVar, "$activity");
        AppEnvironmentSelectionFragment.C23976a aVar = AppEnvironmentSelectionFragment.f60180z;
        FragmentManager g0 = eVar.mo57175g0();
        Intrinsics.checkNotNullExpressionValue(g0, "activity.supportFragmentManager");
        aVar.mo70157a(g0);
        return true;
    }

    /* renamed from: h0 */
    public static /* synthetic */ void m158938h0(ToolBarDefaultView toolBarDefaultView, C0475e eVar, C11300l lVar, int i, Object obj) {
        if ((i & 2) != 0) {
            lVar = null;
        }
        toolBarDefaultView.mo121277g0(eVar, lVar);
    }

    /* renamed from: i0 */
    public static final void m158939i0(C0475e eVar, EditText editText, ToolBarDefaultView toolBarDefaultView, View view, boolean z) {
        BottomNavActivity bottomNavActivity;
        NavController k;
        BottomNavActivity bottomNavActivity2;
        NavController k2;
        Intrinsics.checkNotNullParameter(eVar, "$activity");
        Intrinsics.checkNotNullParameter(editText, "$this_apply");
        Intrinsics.checkNotNullParameter(toolBarDefaultView, "this$0");
        if (z) {
            FragmentManager g0 = eVar.mo57175g0();
            Intrinsics.checkNotNullExpressionValue(g0, "activity.supportFragmentManager");
            if (!(FragmentKt.m118818f(g0) instanceof ProductSearchFragment)) {
                editText.removeTextChangedListener(toolBarDefaultView.f97221o1);
                editText.addTextChangedListener(toolBarDefaultView.f97221o1);
                FragmentManager g02 = eVar.mo57175g0();
                Intrinsics.checkNotNullExpressionValue(g02, "activity.supportFragmentManager");
                Fragment f = FragmentKt.m118818f(g02);
                if (f instanceof HomePageFragment) {
                    if (eVar instanceof BottomNavActivity) {
                        bottomNavActivity2 = (BottomNavActivity) eVar;
                    } else {
                        bottomNavActivity2 = null;
                    }
                    if (bottomNavActivity2 != null && (k2 = bottomNavActivity2.mo83823k()) != null) {
                        k2.mo58142g0(C24142f.C24153k.m106342q(C24142f.f60384a, false, 1, (Object) null));
                    }
                } else if (f instanceof DepartmentFragment) {
                    if (eVar instanceof BottomNavActivity) {
                        bottomNavActivity = (BottomNavActivity) eVar;
                    } else {
                        bottomNavActivity = null;
                    }
                    if (bottomNavActivity != null && (k = bottomNavActivity.mo83823k()) != null) {
                        k.mo58142g0(C39785g.C39788c.m162344e(C39785g.f101518a, false, 1, (Object) null));
                    }
                }
            }
        }
    }

    /* renamed from: j0 */
    public static final void m158940j0(C11300l lVar, View view) {
        if (lVar != null) {
            Intrinsics.checkNotNullExpressionValue(view, "it");
            lVar.invoke(view);
        }
    }

    /* renamed from: m0 */
    public static /* synthetic */ void m158941m0(ToolBarDefaultView toolBarDefaultView, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = R.color.ds_primary_dark;
        }
        toolBarDefaultView.mo121279l0(str, i);
    }

    /* renamed from: o0 */
    public static /* synthetic */ void m158942o0(ToolBarDefaultView toolBarDefaultView, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = R.color.ds_primary_dark;
        }
        toolBarDefaultView.mo121280n0(str, str2, i);
    }

    /* renamed from: p0 */
    public static final void m158943p0(C11289a aVar, View view) {
        Intrinsics.checkNotNullParameter(aVar, "$action");
        aVar.invoke();
    }

    /* renamed from: r0 */
    public static /* synthetic */ void m158944r0(ToolBarDefaultView toolBarDefaultView, boolean z, C11300l lVar, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            lVar = null;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        toolBarDefaultView.mo121281q0(z, lVar, z2);
    }

    /* renamed from: s0 */
    public static final void m158945s0(C11300l lVar, View view) {
        Intrinsics.checkNotNullParameter(lVar, "$tmp0");
        lVar.invoke(view);
    }

    public static /* synthetic */ void setup$default(ToolBarDefaultView toolBarDefaultView, C11300l lVar, C11300l lVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = null;
        }
        toolBarDefaultView.setup(lVar, lVar2);
    }

    /* renamed from: v0 */
    public static /* synthetic */ void m158946v0(ToolBarDefaultView toolBarDefaultView, boolean z, C11300l lVar, int i, Object obj) {
        if ((i & 2) != 0) {
            lVar = null;
        }
        toolBarDefaultView.mo121286u0(z, lVar);
    }

    /* renamed from: w0 */
    public static final void m158947w0(C11300l lVar, View view) {
        Intrinsics.checkNotNullParameter(lVar, "$tmp0");
        lVar.invoke(view);
    }

    /* renamed from: d0 */
    public final void mo121275d0() {
        EditText editText = this.f97220n1.f91339e;
        editText.setOnFocusChangeListener((View.OnFocusChangeListener) null);
        editText.removeTextChangedListener(this.f97221o1);
        editText.getText().clear();
        if (editText.getVisibility() != 8) {
            editText.setVisibility(8);
        }
        ImageButton imageButton = this.f97220n1.f91338d;
        imageButton.clearAnimation();
        if (imageButton.getVisibility() != 8) {
            imageButton.setVisibility(8);
        }
        this.f97220n1.f91340f.setVisibility(8);
    }

    /* renamed from: e0 */
    public final void mo121276e0() {
        TextView textView = this.f97220n1.f91341g;
        textView.setText((CharSequence) null);
        if (textView.getVisibility() != 8) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: g0 */
    public final void mo121277g0(@C12579k C0475e eVar, @C12580l C11300l<? super View, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(eVar, C0696c.f2306r);
        setVisibility(0);
        mo121276e0();
        EditText editText = this.f97220n1.f91339e;
        editText.getText().clear();
        editText.setOnFocusChangeListener(new C38410d(eVar, editText, this));
        if (editText.getVisibility() != 0) {
            editText.setVisibility(0);
        }
        ImageButton imageButton = this.f97220n1.f91338d;
        imageButton.clearAnimation();
        if (imageButton.getVisibility() != 8) {
            imageButton.setVisibility(8);
        }
        ImageButton imageButton2 = this.f97220n1.f91340f;
        imageButton2.setVisibility(0);
        imageButton2.setOnClickListener(new C38411e(lVar));
    }

    /* renamed from: k0 */
    public final void mo121278k0(@C0324b1 int i) {
        setVisibility(0);
        mo121275d0();
        m158941m0(this, getContext().getString(i), 0, 2, (Object) null);
    }

    /* renamed from: l0 */
    public final void mo121279l0(@C12580l String str, int i) {
        setVisibility(0);
        mo121275d0();
        TextView textView = this.f97220n1.f91341g;
        textView.setTextColor(C17318d.m79723f(textView.getContext(), i));
        textView.setText(str);
        if (textView.getVisibility() != 0) {
            textView.setVisibility(0);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: n0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo121280n0(@org.jetbrains.annotations.C12579k java.lang.String r6, @org.jetbrains.annotations.C12580l java.lang.String r7, int r8) {
        /*
            r5 = this;
            java.lang.String r0 = "title"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            r5.setVisibility(r0)
            r5.mo121275d0()
            com.carrefour.fid.android.databinding.m8 r1 = r5.f97220n1
            android.widget.TextView r1 = r1.f91341g
            android.content.Context r2 = r1.getContext()
            int r8 = androidx.core.content.C17318d.m79723f(r2, r8)
            r1.setTextColor(r8)
            r8 = 1
            if (r7 == 0) goto L_0x0027
            boolean r2 = kotlin.text.C11622t.isBlank(r7)
            if (r2 == 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r2 = r0
            goto L_0x0028
        L_0x0027:
            r2 = r8
        L_0x0028:
            if (r2 == 0) goto L_0x002b
            goto L_0x005b
        L_0x002b:
            android.text.SpannableString r2 = new android.text.SpannableString
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            java.lang.String r4 = "\n"
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r2.<init>(r7)
            android.text.style.RelativeSizeSpan r7 = new android.text.style.RelativeSizeSpan
            r3 = 1062836634(0x3f59999a, float:0.85)
            r7.<init>(r3)
            int r6 = r6.length()
            int r6 = r6 + r8
            int r8 = r2.length()
            r3 = 18
            r2.setSpan(r7, r6, r8, r3)
            r6 = r2
        L_0x005b:
            r1.setText(r6)
            int r6 = r1.getVisibility()
            if (r6 == 0) goto L_0x0067
            r1.setVisibility(r0)
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView.mo121280n0(java.lang.String, java.lang.String, int):void");
    }

    /* renamed from: q0 */
    public final void mo121281q0(boolean z, @C12580l C11300l<? super View, C11079d2> lVar, boolean z2) {
        int i;
        int i2;
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.ds_spacing_s);
        EditText editText = this.f97220n1.f91339e;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.editToolbarHomeAccountSearch");
        if (z) {
            i = 0;
        } else {
            i = dimensionPixelOffset;
        }
        com.carrefour.fid.android.shared.extension.ViewKt.m118983H(editText, i, 0, dimensionPixelOffset, 0);
        ImageButton imageButton = this.f97220n1.f91336b;
        Intrinsics.checkNotNullExpressionValue(imageButton, "binding.buttonToolbarHomeAccountBack");
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        imageButton.setVisibility(i2);
        if (z) {
            ImageButton imageButton2 = this.f97220n1.f91336b;
            if (z2) {
                imageButton2.setImageResource(R.drawable.ds_ic_chevron_left);
                imageButton2.setColorFilter(imageButton2.getContext().getColor(R.color.ds_grey_white));
                Context context = imageButton2.getContext();
                Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
                mo121285t0(context, false);
            } else {
                imageButton2.setImageResource(R.drawable.ic_back);
                imageButton2.setColorFilter(imageButton2.getContext().getColor(R.color.ds_primary));
                Context context2 = imageButton2.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, C9175a.f24932Y);
                mo121285t0(context2, true);
            }
        }
        if (lVar != null) {
            this.f97220n1.f91336b.setOnClickListener(new C38413g(lVar));
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f97220n1.f91336b.setEnabled(z);
        this.f97220n1.f91337c.setEnabled(z);
        this.f97220n1.f91339e.setEnabled(z);
    }

    public final void setup(@C12580l C11300l<? super View, C11079d2> lVar, @C12579k C11300l<? super C38407a, C11079d2> lVar2) {
        boolean z;
        Intrinsics.checkNotNullParameter(lVar2, "settingsCreator");
        C38407a aVar = new C38407a();
        lVar2.invoke(aVar);
        C38391a i = aVar.mo121308i();
        if (Intrinsics.areEqual((Object) i, (Object) C38391a.C38392a.f97223b)) {
            mo121278k0(R.string.account_title);
        } else if (Intrinsics.areEqual((Object) i, (Object) C38391a.C38393b.f97225b)) {
            mo121278k0(R.string.account_parameter_toolbar_title);
        } else if (Intrinsics.areEqual((Object) i, (Object) C38391a.C38394c.f97227b)) {
            mo121278k0(R.string.basket_builer_title_toolbar);
        } else if (Intrinsics.areEqual((Object) i, (Object) C38391a.C38400i.f97239b)) {
            mo121278k0(R.string.loyalty_title_tool_bar);
            this.f97220n1.f91337c.setContentDescription(getContext().getString(R.string.accessibility_delete_fid_card));
        } else {
            boolean z2 = true;
            if (Intrinsics.areEqual((Object) i, (Object) C38391a.C38395d.f97229b)) {
                z = true;
            } else {
                z = Intrinsics.areEqual((Object) i, (Object) C38391a.C38402k.f97243b);
            }
            if (z) {
                mo121278k0(R.string.shopping_list_all_list_title);
            } else {
                if (!Intrinsics.areEqual((Object) i, (Object) C38391a.C38403l.f97245b)) {
                    z2 = Intrinsics.areEqual((Object) i, (Object) C38391a.C38404m.f97247b);
                }
                if (z2) {
                    mo121278k0(R.string.store_page_activity_title);
                } else if (i instanceof C38391a.C38399h) {
                    mo121277g0(((C38391a.C38399h) i).mo121289d(), lVar);
                } else if (i instanceof C38391a.C38405n) {
                    mo121277g0(((C38391a.C38405n) i).mo121295d(), lVar);
                } else if (Intrinsics.areEqual((Object) i, (Object) C38391a.C38396e.f97231b)) {
                    mo121278k0(R.string.my_basket);
                } else if (Intrinsics.areEqual((Object) i, (Object) C38391a.C38397f.f97233b)) {
                    mo121278k0(R.string.checkout_order_confirmation);
                } else if (Intrinsics.areEqual((Object) i, (Object) C38391a.C38398g.f97235b)) {
                    mo121278k0(R.string.checkout_payment_error_title);
                } else if (Intrinsics.areEqual((Object) i, (Object) C38391a.C38401j.f97241b)) {
                    setVisibility(8);
                }
            }
        }
        m158944r0(this, aVar.mo121304e(), aVar.mo121306g(), false, 4, (Object) null);
        mo121286u0(aVar.mo121305f(), aVar.mo121307h());
    }

    @C11395k(message = "Use toolbar.setup { } instead.")
    public final void setupDeleteButton(@C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "action");
        this.f97220n1.f91337c.setOnClickListener(new C38414h(aVar));
    }

    /* renamed from: t0 */
    public final void mo121285t0(Context context, boolean z) {
        int i;
        Toolbar toolbar = this.f97220n1.f91342h;
        if (z) {
            i = R.color.ds_grey_white;
        } else {
            i = R.color.ds_primary;
        }
        toolbar.setBackgroundColor(C17318d.m79723f(context, i));
    }

    /* renamed from: u0 */
    public final void mo121286u0(boolean z, @C12580l C11300l<? super View, C11079d2> lVar) {
        int i;
        ImageButton imageButton = this.f97220n1.f91337c;
        Intrinsics.checkNotNullExpressionValue(imageButton, "binding.buttonToolbarHomeAccountDelete");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageButton.setVisibility(i);
        if (lVar != null) {
            this.f97220n1.f91337c.setOnClickListener(new C38412f(lVar));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ToolBarDefaultView(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ToolBarDefaultView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public ToolBarDefaultView(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C36767m8 d = C36767m8.m150797d(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(\n        LayoutI…ontext), this, true\n    )");
        this.f97220n1 = d;
        this.f97221o1 = new C38406b(this);
        d.f91336b.setOnClickListener(new C38408b(C28775q.m119094b(context)));
        d.f91338d.setOnClickListener(new C38409c(this));
        EditText editText = d.f91339e;
    }
}
