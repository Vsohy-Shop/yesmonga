package com.carrefour.fid.android.account.presentation.p018ui.address;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioGroup;
import androidx.compose.runtime.internal.C8553b;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.C19766m;
import androidx.navigation.fragment.C19736g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.account.C13144b;
import com.carrefour.fid.android.account.databinding.C13220g;
import com.carrefour.fid.android.account.p017io.DQEAddressThrowable;
import com.carrefour.fid.android.account.presentation.models.DQEAddressModel;
import com.carrefour.fid.android.account.presentation.p018ui.address.C13463g;
import com.carrefour.fid.android.account.presentation.p018ui.address.adapter.C13440b;
import com.carrefour.fid.android.account.presentation.viewmodels.address.AccountAddressViewModel;
import com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13645a;
import com.carrefour.fid.android.design.components.extension.EditTextKt;
import com.carrefour.fid.android.design.components.extension.ViewKt;
import com.carrefour.fid.android.design.components.widgets.DeliverySwitchComponent;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.design.components.widgets.SwitchComponent;
import com.carrefour.fid.android.design.components.widgets.TextAreaComponent;
import com.carrefour.fid.android.domain.models.AddressCategory;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.shared.base.ObserverWhileStartedImpl;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.extension.StringKt;
import com.carrefour.fid.android.shared.navigation.C28795b;
import com.carrefour.fid.android.shared.presentation.components.decoration.C28852a;
import com.carrefour.fid.android.shared.util.C28936j;
import com.carrefour.fid.android.various.core.utils.contentsquare.C22757a;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputEditText;
import dagger.hilt.android.C10164b;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.C11677z;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.C10977s0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11510n;
import kotlin.text.C11622t;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002noB\u0007¢\u0006\u0004\bl\u0010mJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0002J\u0019\u0010\u000e\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0003H\u0002J\b\u0010\u0011\u001a\u00020\u0003H\u0002J\u0016\u0010\u0015\u001a\u00020\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010 \u001a\u00020\u0003H\u0002J\b\u0010!\u001a\u00020\u0003H\u0002J\b\u0010#\u001a\u00020\"H\u0002J\u0010\u0010&\u001a\u00020\u00032\u0006\u0010%\u001a\u00020$H\u0002J\b\u0010'\u001a\u00020\u0003H\u0002J0\u0010,\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u0019H\u0002J\u0010\u0010.\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u0019H\u0002J\u0010\u0010/\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0019H\u0002J\u0010\u00100\u001a\u00020\f2\u0006\u0010(\u001a\u00020\u0019H\u0002J\u0010\u00101\u001a\u00020\f2\u0006\u0010)\u001a\u00020\u0019H\u0002J\u0010\u00102\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u0019H\u0002J\u0010\u00104\u001a\u00020\u00032\u0006\u00103\u001a\u00020\fH\u0002J\u0010\u00105\u001a\u00020\u00032\u0006\u00103\u001a\u00020\fH\u0002J\b\u00106\u001a\u00020\u0003H\u0002J\b\u00107\u001a\u00020\u0003H\u0002J\u0010\u00109\u001a\u00020\u00032\u0006\u00108\u001a\u00020\fH\u0002J\u001a\u0010>\u001a\u00020\u00032\u0006\u0010;\u001a\u00020:2\b\u0010=\u001a\u0004\u0018\u00010<H\u0016J\b\u0010?\u001a\u00020\u0003H\u0016J\b\u0010@\u001a\u00020\u0003H\u0016J\b\u0010A\u001a\u00020\u0003H\u0016J\b\u0010B\u001a\u00020\u0003H\u0016J\b\u0010C\u001a\u00020\u0003H\u0016R\u001b\u0010I\u001a\u00020D8BX\u0002¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u001b\u0010O\u001a\u00020J8BX\u0002¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001b\u0010S\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\bP\u0010F\u001a\u0004\bQ\u0010RR\u0018\u0010V\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\"\u0010^\u001a\u00020W8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u0014\u0010b\u001a\u00020_8\u0002X\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010e\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010i\u001a\u00020f8\u0002X\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010k\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bj\u0010d¨\u0006p"}, mo22516d2 = {"Lcom/carrefour/fid/android/account/presentation/ui/address/UpdateUserAddressFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/account/databinding/g;", "Lkotlin/d2;", "B1", "q1", "Lcom/carrefour/fid/android/account/presentation/viewmodels/address/mvi/a$b;", "uiEvent", "G1", "Lcom/carrefour/fid/android/account/presentation/viewmodels/address/mvi/a$c;", "uiState", "I1", "", "loading", "p1", "(Ljava/lang/Boolean;)V", "t1", "initHeader", "", "Lcom/carrefour/fid/android/account/presentation/models/DQEAddressModel;", "result", "o1", "Lcom/carrefour/fid/android/account/presentation/viewmodels/address/mvi/a$c$a;", "address", "F1", "", "country", "K1", "N1", "M1", "L1", "i1", "initListeners", "s1", "Lcom/carrefour/fid/android/domain/models/account/Address;", "l1", "Lcom/carrefour/fid/android/account/presentation/ui/address/UpdateUserAddressFragment$Field;", "field", "C1", "J1", "city", "postalCode", "telephone", "floor", "h1", "phoneNumber", "z1", "v1", "w1", "A1", "y1", "isEnabled", "k1", "j1", "g1", "H1", "isKeyboardVisible", "E1", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onStart", "onStop", "onResume", "onPause", "onDestroyView", "Lcom/carrefour/fid/android/account/presentation/viewmodels/address/AccountAddressViewModel;", "f", "Lkotlin/z;", "n1", "()Lcom/carrefour/fid/android/account/presentation/viewmodels/address/AccountAddressViewModel;", "viewModel", "Lcom/carrefour/fid/android/account/presentation/ui/address/f;", "g", "Landroidx/navigation/m;", "m1", "()Lcom/carrefour/fid/android/account/presentation/ui/address/f;", "args", "v", "x1", "()Z", "isDeliveryAddress", "w", "Lcom/carrefour/fid/android/account/presentation/viewmodels/address/mvi/a$c$a;", "currentStateAddress", "Lcom/carrefour/fid/android/shared/util/j;", "x", "Lcom/carrefour/fid/android/shared/util/j;", "getFragmentUtil", "()Lcom/carrefour/fid/android/shared/util/j;", "setFragmentUtil", "(Lcom/carrefour/fid/android/shared/util/j;)V", "fragmentUtil", "Lcom/carrefour/fid/android/account/presentation/ui/address/adapter/b$a;", "y", "Lcom/carrefour/fid/android/account/presentation/ui/address/adapter/b$a;", "adapterCallback", "z", "Z", "isKeyboardShowing", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "X", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayoutListener", "Y", "isAddressTextModificationLocked", "<init>", "()V", "a", "Field", "account_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nUpdateUserAddressFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdateUserAddressFragment.kt\ncom/carrefour/fid/android/account/presentation/ui/address/UpdateUserAddressFragment\n+ 2 HiltNavGraphViewModelLazy.kt\nandroidx/hilt/navigation/fragment/HiltNavGraphViewModelLazyKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 4 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 Lifecycle.kt\ncom/carrefour/fid/android/shared/base/LifecycleKt\n*L\n1#1,715:1\n48#2,9:716\n42#3,3:725\n183#4,6:728\n168#4,7:734\n262#5,2:741\n262#5,2:743\n262#5,2:745\n262#5,2:747\n262#5,2:749\n262#5,2:751\n260#5:761\n260#5:762\n260#5:763\n260#5:764\n260#5:765\n260#5:766\n260#5:767\n260#5:768\n1#6:753\n13644#7,3:754\n75#8,2:757\n75#8,2:759\n*S KotlinDebug\n*F\n+ 1 UpdateUserAddressFragment.kt\ncom/carrefour/fid/android/account/presentation/ui/address/UpdateUserAddressFragment\n*L\n93#1:716,9\n95#1:725,3\n147#1:728,6\n148#1:734,7\n238#1:741,2\n288#1:743,2\n289#1:745,2\n303#1:747,2\n392#1:749,2\n395#1:751,2\n553#1:761\n555#1:762\n557#1:763\n559#1:764\n561#1:765\n607#1:766\n623#1:767\n626#1:768\n457#1:754,3\n523#1:757,2\n539#1:759,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.account.presentation.ui.address.UpdateUserAddressFragment */
public final class UpdateUserAddressFragment extends C13438a<C13220g> {
    @C12580l

    /* renamed from: E0 */
    public static final String f32818E0 = C11342l0.m43547d(UpdateUserAddressFragment.class).mo22848s();

    /* renamed from: F0 */
    public static final int f32819F0 = 5;

    /* renamed from: G0 */
    public static final long f32820G0 = 500;
    @C12579k

    /* renamed from: H0 */
    public static final DeliverySwitchComponent.SwitchOption f32821H0 = DeliverySwitchComponent.SwitchOption.SECOND;
    @C12579k

    /* renamed from: I0 */
    public static final Map<String, Integer> f32822I0 = C10977s0.m41469j0(C11078d1.m42659a("FRANCE", Integer.valueOf(C13144b.C13152h.ic_french_full_flag)), C11078d1.m42659a("ALLEMAGNE", Integer.valueOf(C13144b.C13152h.ic_germany_flag)), C11078d1.m42659a("ANDORRE", Integer.valueOf(C13144b.C13152h.ic_andorra_flag)), C11078d1.m42659a("BELGIQUE", Integer.valueOf(C13144b.C13152h.ic_belgium_flag)), C11078d1.m42659a("ESPAGNE", Integer.valueOf(C13144b.C13152h.ic_spain_flag)), C11078d1.m42659a("ITALIE", Integer.valueOf(C13144b.C13152h.ic_italy_flag)), C11078d1.m42659a("LUXEMBOURG", Integer.valueOf(C13144b.C13152h.ic_luxembourg_flag)), C11078d1.m42659a("MONACO", Integer.valueOf(C13144b.C13152h.ic_monaco_flag)), C11078d1.m42659a("PAYS-BAS", Integer.valueOf(C13144b.C13152h.ic_netherlands_flag)), C11078d1.m42659a("SUISSE", Integer.valueOf(C13144b.C13152h.ic_switzerland_flag)));
    @C12579k

    /* renamed from: Z */
    public static final C13408a f32823Z = new C13408a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: X */
    public final ViewTreeObserver.OnGlobalLayoutListener f32824X = new C13459d(this);

    /* renamed from: Y */
    public boolean f32825Y;
    @C12579k

    /* renamed from: f */
    public final C11677z f32826f;
    @C12579k

    /* renamed from: g */
    public final C19766m f32827g = new C19766m(C11342l0.m43547d(C13461f.class), new UpdateUserAddressFragment$special$$inlined$navArgs$1(this));
    @C12579k

    /* renamed from: v */
    public final C11677z f32828v = C10864b0.m38748c(new UpdateUserAddressFragment$isDeliveryAddress$2(this));
    @C12580l

    /* renamed from: w */
    public C13645a.C13658c.C13659a f32829w;
    @Inject

    /* renamed from: x */
    public C28936j f32830x;
    @C12579k

    /* renamed from: y */
    public final C13440b.C13441a f32831y = new C13410c(this);

    /* renamed from: z */
    public boolean f32832z;

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, mo22516d2 = {"Lcom/carrefour/fid/android/account/presentation/ui/address/UpdateUserAddressFragment$Field;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "account_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    /* renamed from: com.carrefour.fid.android.account.presentation.ui.address.UpdateUserAddressFragment$Field */
    public enum Field {
        f32834a,
        CITY,
        POSTCODE,
        COUNTRY,
        TELEPHONE,
        FLOOR
    }

    /* renamed from: com.carrefour.fid.android.account.presentation.ui.address.UpdateUserAddressFragment$a */
    public static final class C13408a {
        public /* synthetic */ C13408a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12580l
        /* renamed from: a */
        public final String mo31834a() {
            return UpdateUserAddressFragment.f32818E0;
        }

        public C13408a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.account.presentation.ui.address.UpdateUserAddressFragment$b */
    public /* synthetic */ class C13409b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|7|8|9|10|11|12|13|15) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.carrefour.fid.android.account.presentation.ui.address.UpdateUserAddressFragment$Field[] r0 = com.carrefour.fid.android.account.presentation.p018ui.address.UpdateUserAddressFragment.Field.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.account.presentation.ui.address.UpdateUserAddressFragment$Field r1 = com.carrefour.fid.android.account.presentation.p018ui.address.UpdateUserAddressFragment.Field.f32834a     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.account.presentation.ui.address.UpdateUserAddressFragment$Field r1 = com.carrefour.fid.android.account.presentation.p018ui.address.UpdateUserAddressFragment.Field.CITY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.account.presentation.ui.address.UpdateUserAddressFragment$Field r1 = com.carrefour.fid.android.account.presentation.p018ui.address.UpdateUserAddressFragment.Field.POSTCODE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.carrefour.fid.android.account.presentation.ui.address.UpdateUserAddressFragment$Field r1 = com.carrefour.fid.android.account.presentation.p018ui.address.UpdateUserAddressFragment.Field.COUNTRY     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.carrefour.fid.android.account.presentation.ui.address.UpdateUserAddressFragment$Field r1 = com.carrefour.fid.android.account.presentation.p018ui.address.UpdateUserAddressFragment.Field.TELEPHONE     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                com.carrefour.fid.android.account.presentation.ui.address.UpdateUserAddressFragment$Field r1 = com.carrefour.fid.android.account.presentation.p018ui.address.UpdateUserAddressFragment.Field.FLOOR     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.presentation.p018ui.address.UpdateUserAddressFragment.C13409b.<clinit>():void");
        }
    }

    /* renamed from: com.carrefour.fid.android.account.presentation.ui.address.UpdateUserAddressFragment$c */
    public static final class C13410c implements C13440b.C13441a {

        /* renamed from: a */
        public final /* synthetic */ UpdateUserAddressFragment f32841a;

        public C13410c(UpdateUserAddressFragment updateUserAddressFragment) {
            this.f32841a = updateUserAddressFragment;
        }

        /* renamed from: a */
        public final void mo31835a(@C12579k DQEAddressModel dQEAddressModel) {
            Intrinsics.checkNotNullParameter(dQEAddressModel, "address");
            this.f32841a.mo31821n1().sendIntent(new C13645a.C13665d.C13669d(dQEAddressModel));
            TextInputEditText textInputEditText = UpdateUserAddressFragment.m57788V0(this.f32841a).f32465i;
            Intrinsics.checkNotNullExpressionValue(textInputEditText, "binding.addressTextinputEdittext");
            EditTextKt.m152107a(textInputEditText, dQEAddressModel.mo31628j());
            TextInputEditText textInputEditText2 = UpdateUserAddressFragment.m57788V0(this.f32841a).f32450H;
            Intrinsics.checkNotNullExpressionValue(textInputEditText2, "binding.postalCodeTextinputEdittext");
            EditTextKt.m152107a(textInputEditText2, dQEAddressModel.mo31634p());
            TextInputEditText textInputEditText3 = UpdateUserAddressFragment.m57788V0(this.f32841a).f32470n;
            Intrinsics.checkNotNullExpressionValue(textInputEditText3, "binding.cityTextinputEdittext");
            EditTextKt.m152107a(textInputEditText3, dQEAddressModel.mo31629k());
            UpdateUserAddressFragment.m57788V0(this.f32841a).f32444B.setVisibility(8);
            this.f32841a.mo31821n1().mo31585I(this.f32841a.mo31830x1());
        }
    }

    public UpdateUserAddressFragment() {
        super(C134071.f32833a);
        C11677z c = C10864b0.m38748c(new C13421xe379ac0e(this, C13144b.C13154j.account_user_address_graph));
        this.f32826f = FragmentViewModelLazyKt.m89922g(this, C11342l0.m43547d(AccountAddressViewModel.class), new C13422xe379ac0f(c, (C11510n) null), new C13423xe379ac10(this, c, (C11510n) null));
    }

    /* renamed from: D1 */
    public static final void m57782D1(UpdateUserAddressFragment updateUserAddressFragment) {
        Intrinsics.checkNotNullParameter(updateUserAddressFragment, "this$0");
        View view = updateUserAddressFragment.getView();
        if (view != null) {
            Rect rect = new Rect();
            view.getWindowVisibleDisplayFrame(rect);
            int height = view.getRootView().getHeight();
            if (((double) (height - rect.bottom)) > ((double) height) * 0.15d) {
                if (!updateUserAddressFragment.f32832z) {
                    updateUserAddressFragment.f32832z = true;
                    updateUserAddressFragment.mo31801E1(true);
                }
            } else if (updateUserAddressFragment.f32832z) {
                updateUserAddressFragment.f32832z = false;
                updateUserAddressFragment.mo31801E1(false);
            }
        }
    }

    /* renamed from: V0 */
    public static final /* synthetic */ C13220g m57788V0(UpdateUserAddressFragment updateUserAddressFragment) {
        return (C13220g) updateUserAddressFragment.getBinding();
    }

    /* renamed from: r1 */
    public static final void m57799r1(UpdateUserAddressFragment updateUserAddressFragment, View view) {
        Intrinsics.checkNotNullParameter(updateUserAddressFragment, "this$0");
        ((C13220g) updateUserAddressFragment.getBinding()).f32465i.setEnabled(false);
        updateUserAddressFragment.mo31821n1().sendIntent(new C13645a.C13665d.C13671f(updateUserAddressFragment.mo31819l1(), StringKt.m118926f(String.valueOf(((C13220g) updateUserAddressFragment.getBinding()).f32454L.getText())), updateUserAddressFragment.mo31820m1().mo31920k()));
    }

    /* renamed from: u1 */
    public static final void m57800u1(UpdateUserAddressFragment updateUserAddressFragment, AdapterView adapterView, View view, int i, long j) {
        Intrinsics.checkNotNullParameter(updateUserAddressFragment, "this$0");
        updateUserAddressFragment.mo31807K1(((C13220g) updateUserAddressFragment.getBinding()).f32472p.getText().toString());
        updateUserAddressFragment.mo31800C1(Field.COUNTRY);
    }

    /* renamed from: A1 */
    public final boolean mo31798A1(String str) {
        boolean z;
        String str2;
        boolean z2 = true;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || str.length() < 2) {
            z2 = false;
        }
        TextAreaComponent textAreaComponent = ((C13220g) getBinding()).f32449G;
        if (!z2) {
            str2 = getString(C13144b.C13163s.account_form_address_postal_code_error);
        } else {
            str2 = null;
        }
        textAreaComponent.setError(str2);
        return z2;
    }

    /* renamed from: B1 */
    public final void mo31799B1() {
        C13220g gVar = (C13220g) getBinding();
        TextInputEditText textInputEditText = gVar.f32465i;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "addressTextinputEdittext");
        TextInputEditText textInputEditText2 = gVar.f32450H;
        Intrinsics.checkNotNullExpressionValue(textInputEditText2, "postalCodeTextinputEdittext");
        TextInputEditText textInputEditText3 = gVar.f32470n;
        Intrinsics.checkNotNullExpressionValue(textInputEditText3, "cityTextinputEdittext");
        TextInputEditText textInputEditText4 = gVar.f32454L;
        Intrinsics.checkNotNullExpressionValue(textInputEditText4, "telephoneTextinputEdittext");
        TextInputEditText textInputEditText5 = gVar.f32468l;
        Intrinsics.checkNotNullExpressionValue(textInputEditText5, "buildingTextinputEdittext");
        TextInputEditText textInputEditText6 = gVar.f32443A;
        Intrinsics.checkNotNullExpressionValue(textInputEditText6, "digitalCodeTextinputEdittext");
        TextInputEditText textInputEditText7 = gVar.f32448F;
        Intrinsics.checkNotNullExpressionValue(textInputEditText7, "interphoneTextinputEdittext");
        TextInputEditText textInputEditText8 = gVar.f32446D;
        Intrinsics.checkNotNullExpressionValue(textInputEditText8, "floorTextinputEdittext");
        TextInputEditText textInputEditText9 = gVar.f32478v;
        Intrinsics.checkNotNullExpressionValue(textInputEditText9, "deliveryNoteTextinputEdittext");
        RecyclerView recyclerView = gVar.f32444B;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "dqeSuggestionsRecyclerview");
        C22757a.m102927a(CollectionsKt__CollectionsKt.m40448L(textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, textInputEditText5, textInputEditText6, textInputEditText7, textInputEditText8, textInputEditText9, recyclerView));
    }

    /* renamed from: C1 */
    public final void mo31800C1(Field field) {
        String valueOf = String.valueOf(((C13220g) getBinding()).f32465i.getText());
        String valueOf2 = String.valueOf(((C13220g) getBinding()).f32470n.getText());
        String valueOf3 = String.valueOf(((C13220g) getBinding()).f32450H.getText());
        String valueOf4 = String.valueOf(((C13220g) getBinding()).f32446D.getText());
        String valueOf5 = String.valueOf(((C13220g) getBinding()).f32454L.getText());
        String obj = ((C13220g) getBinding()).f32472p.getText().toString();
        String str = null;
        switch (C13409b.$EnumSwitchMapping$0[field.ordinal()]) {
            case 1:
                if (!mo31830x1()) {
                    C13645a.C13658c.C13659a aVar = this.f32829w;
                    if (aVar != null) {
                        str = aVar.getAddress();
                    }
                    if (!Intrinsics.areEqual((Object) valueOf, (Object) str)) {
                        mo31806J1();
                    }
                }
                mo31828v1(valueOf);
                break;
            case 2:
                if (!mo31830x1()) {
                    C13645a.C13658c.C13659a aVar2 = this.f32829w;
                    if (aVar2 != null) {
                        str = aVar2.getCity();
                    }
                    if (!Intrinsics.areEqual((Object) valueOf2, (Object) str)) {
                        mo31806J1();
                    }
                }
                mo31829w1(valueOf2);
                break;
            case 3:
                if (!mo31830x1()) {
                    C13645a.C13658c.C13659a aVar3 = this.f32829w;
                    if (aVar3 != null) {
                        str = aVar3.getPostcode();
                    }
                    if (!Intrinsics.areEqual((Object) valueOf3, (Object) str)) {
                        mo31806J1();
                    }
                }
                mo31798A1(valueOf3);
                break;
            case 4:
                if (!mo31830x1()) {
                    C13645a.C13658c.C13659a aVar4 = this.f32829w;
                    if (aVar4 != null) {
                        str = aVar4.getCountry();
                    }
                    if (!Intrinsics.areEqual((Object) obj, (Object) str)) {
                        mo31806J1();
                        break;
                    }
                }
                break;
            case 5:
                mo31832z1(valueOf5);
                break;
            case 6:
                mo31831y1(valueOf4);
                break;
        }
        mo31818k1(mo31813h1(valueOf, valueOf2, valueOf3, valueOf5, valueOf4));
    }

    /* renamed from: E1 */
    public final void mo31801E1(boolean z) {
        C28795b.m119161a(this, !z);
    }

    /* renamed from: F1 */
    public final void mo31802F1(C13645a.C13658c.C13659a aVar) {
        mo31810N1(aVar);
        if (mo31814i1(aVar)) {
            mo31809M1(aVar);
        } else {
            mo31808L1(aVar);
        }
    }

    /* renamed from: G1 */
    public final void mo31803G1(C13645a.C13653b bVar) {
        C13645a.C13653b bVar2 = bVar;
        if (Intrinsics.areEqual((Object) bVar2, (Object) C13645a.C13653b.C13654a.f33210a)) {
            mo31824q1();
        } else if (!(bVar2 instanceof C13645a.C13653b.C13655b)) {
            boolean z = false;
            if (bVar2 instanceof C13645a.C13653b.C13657d) {
                C13463g.C13465b bVar3 = C13463g.f32917a;
                C13645a.C13653b.C13657d dVar = (C13645a.C13653b.C13657d) bVar2;
                Address e = dVar.mo32446e();
                String f = dVar.mo32448f();
                if (mo31820m1().mo31919j() != AddressCategory.DELIVERY) {
                    z = true;
                }
                FragmentKt.m118823k(this, bVar3.mo31942a(e, f, z, mo31820m1().mo31920k()));
            } else if (bVar2 instanceof C13645a.C13653b.C13656c) {
                ((C13220g) getBinding()).f32459c.setChecked(((C13645a.C13653b.C13656c) bVar2).mo32439d());
                Group group = ((C13220g) getBinding()).f32466j;
                Intrinsics.checkNotNullExpressionValue(group, "binding.billingSwitchGroup");
                group.setVisibility(0);
            }
        } else if (((C13645a.C13653b.C13655b) bVar2).mo32433d() instanceof DQEAddressThrowable) {
            ((C13220g) getBinding()).f32444B.setVisibility(8);
        } else {
            NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
            String string = getString(C13144b.C13163s.general_error_parameters_server_not_responding_02);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.gener…server_not_responding_02)");
            FragmentKt.m118811B(this, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        }
    }

    /* renamed from: H1 */
    public final void mo31804H1() {
        View view = getView();
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f32824X);
        }
    }

    /* renamed from: I1 */
    public final void mo31805I1(C13645a.C13658c cVar) {
        if (cVar instanceof C13645a.C13658c.C13659a) {
            C13645a.C13658c.C13659a aVar = (C13645a.C13658c.C13659a) cVar;
            this.f32829w = aVar;
            mo31823p1(Boolean.valueOf(aVar.isLoading()));
            mo31802F1(aVar);
            mo31822o1(aVar.mo32451a());
        } else if (Intrinsics.areEqual((Object) cVar, (Object) C13645a.C13658c.C13664e.f33243b)) {
            mo31821n1().sendIntent(new C13645a.C13665d.C13667b(mo31820m1().mo31922m(), mo31820m1().mo31923n(), mo31820m1().mo31919j(), mo31820m1().mo31921l()));
        }
    }

    /* renamed from: J1 */
    public final void mo31806J1() {
        boolean z;
        SwitchComponent switchComponent = ((C13220g) getBinding()).f32459c;
        Intrinsics.checkNotNullExpressionValue(switchComponent, "binding.addressFormBillingSwitch");
        if (switchComponent.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ((C13220g) getBinding()).f32459c.setChecked(false);
        }
    }

    /* renamed from: K1 */
    public final void mo31807K1(String str) {
        int i;
        Integer num = f32822I0.get(str);
        if (num != null) {
            i = num.intValue();
        } else {
            i = C13144b.C13152h.ic_french_full_flag;
        }
        TextAreaComponent textAreaComponent = ((C13220g) getBinding()).f32471o;
        textAreaComponent.setStartIconDrawable(FragmentKt.m118820h(this, i, (Integer) null, 2, (Object) null));
        Drawable startIconDrawable = textAreaComponent.getStartIconDrawable();
        if (startIconDrawable != null) {
            startIconDrawable.setAlpha(255);
        }
    }

    /* renamed from: L1 */
    public final void mo31808L1(C13645a.C13658c.C13659a aVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i;
        boolean z8;
        String str = null;
        boolean z9 = true;
        if (!this.f32825Y) {
            String address = aVar.getAddress();
            if (address.length() > 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (!z8) {
                address = null;
            }
            if (address != null) {
                TextInputEditText textInputEditText = ((C13220g) getBinding()).f32465i;
                Intrinsics.checkNotNullExpressionValue(textInputEditText, "binding.addressTextinputEdittext");
                EditTextKt.m152107a(textInputEditText, address);
            }
        }
        String city = aVar.getCity();
        if (city.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            city = null;
        }
        if (city != null) {
            TextInputEditText textInputEditText2 = ((C13220g) getBinding()).f32470n;
            Intrinsics.checkNotNullExpressionValue(textInputEditText2, "binding.cityTextinputEdittext");
            EditTextKt.m152107a(textInputEditText2, city);
        }
        String postcode = aVar.getPostcode();
        if (postcode.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            postcode = null;
        }
        if (postcode != null) {
            TextInputEditText textInputEditText3 = ((C13220g) getBinding()).f32450H;
            Intrinsics.checkNotNullExpressionValue(textInputEditText3, "binding.postalCodeTextinputEdittext");
            EditTextKt.m152107a(textInputEditText3, postcode);
        }
        String c = aVar.mo32453c();
        if (c.length() > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            c = null;
        }
        if (c != null) {
            TextInputEditText textInputEditText4 = ((C13220g) getBinding()).f32454L;
            Intrinsics.checkNotNullExpressionValue(textInputEditText4, "binding.telephoneTextinputEdittext");
            EditTextKt.m152107a(textInputEditText4, c);
        }
        if (aVar instanceof C13645a.C13658c.C13663d) {
            C13645a.C13658c.C13663d dVar = (C13645a.C13658c.C13663d) aVar;
            String u = dVar.mo32490u();
            if (u.length() > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                u = null;
            }
            if (u != null) {
                TextInputEditText textInputEditText5 = ((C13220g) getBinding()).f32478v;
                Intrinsics.checkNotNullExpressionValue(textInputEditText5, "binding.deliveryNoteTextinputEdittext");
                EditTextKt.m152107a(textInputEditText5, u);
            }
            String w = dVar.mo32492w();
            if (w.length() > 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                w = null;
            }
            if (w != null) {
                TextInputEditText textInputEditText6 = ((C13220g) getBinding()).f32443A;
                Intrinsics.checkNotNullExpressionValue(textInputEditText6, "binding.digitalCodeTextinputEdittext");
                EditTextKt.m152107a(textInputEditText6, w);
            }
            String y = dVar.mo32494y();
            if (y.length() > 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!z6) {
                y = null;
            }
            if (y != null) {
                TextInputEditText textInputEditText7 = ((C13220g) getBinding()).f32448F;
                Intrinsics.checkNotNullExpressionValue(textInputEditText7, "binding.interphoneTextinputEdittext");
                EditTextKt.m152107a(textInputEditText7, y);
            }
            String v = dVar.mo32491v();
            if (v.length() > 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (!z7) {
                v = null;
            }
            if (v != null) {
                TextInputEditText textInputEditText8 = ((C13220g) getBinding()).f32468l;
                Intrinsics.checkNotNullExpressionValue(textInputEditText8, "binding.buildingTextinputEdittext");
                EditTextKt.m152107a(textInputEditText8, v);
            }
            String x = dVar.mo32493x();
            if (x.length() <= 0) {
                z9 = false;
            }
            if (z9) {
                str = x;
            }
            if (str != null) {
                TextInputEditText textInputEditText9 = ((C13220g) getBinding()).f32446D;
                Intrinsics.checkNotNullExpressionValue(textInputEditText9, "binding.floorTextinputEdittext");
                EditTextKt.m152107a(textInputEditText9, str);
            }
            RadioGroup radioGroup = ((C13220g) getBinding()).f32474r;
            if (dVar.mo32495z()) {
                i = C13144b.C13154j.delivery_with_elevator_radiobutton;
            } else {
                i = C13144b.C13154j.delivery_without_elevator_radiobutton;
            }
            radioGroup.check(i);
            return;
        }
        MaterialAutoCompleteTextView materialAutoCompleteTextView = ((C13220g) getBinding()).f32472p;
        String[] stringArray = materialAutoCompleteTextView.getResources().getStringArray(C13144b.C13147c.list_country);
        Intrinsics.checkNotNullExpressionValue(stringArray, "resources.getStringArray(R.array.list_country)");
        int length = stringArray.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            String str2 = stringArray[i2];
            int i4 = i3 + 1;
            Intrinsics.checkNotNullExpressionValue(str2, "country");
            if (C11622t.startsWith$default(str2, aVar.getCountry(), false, 2, (Object) null)) {
                materialAutoCompleteTextView.setText(str2, false);
                materialAutoCompleteTextView.setListSelection(i3);
                mo31807K1(str2);
                return;
            }
            i2++;
            i3 = i4;
        }
        if (!materialAutoCompleteTextView.getAdapter().isEmpty() && materialAutoCompleteTextView.getListSelection() < 0) {
            materialAutoCompleteTextView.setText(materialAutoCompleteTextView.getAdapter().getItem(0).toString(), false);
            materialAutoCompleteTextView.setListSelection(0);
        }
    }

    /* renamed from: M1 */
    public final void mo31809M1(C13645a.C13658c.C13659a aVar) {
        String str;
        if (aVar instanceof C13645a.C13658c.C13663d) {
            str = ((C13645a.C13658c.C13663d) aVar).mo32493x();
        } else {
            str = "";
        }
        mo31818k1(mo31813h1(aVar.getAddress(), aVar.getCity(), aVar.getPostcode(), aVar.mo32453c(), str));
    }

    /* renamed from: N1 */
    public final void mo31810N1(C13645a.C13658c.C13659a aVar) {
        if (aVar instanceof C13645a.C13658c.C13663d) {
            MaterialAutoCompleteTextView materialAutoCompleteTextView = ((C13220g) getBinding()).f32472p;
            String[] stringArray = getResources().getStringArray(C13144b.C13147c.list_country);
            Intrinsics.checkNotNullExpressionValue(stringArray, "resources.getStringArray(R.array.list_country)");
            materialAutoCompleteTextView.setText((CharSequence) ArraysKt___ArraysKt.m40180sc(stringArray));
            C13645a.C13658c.C13663d dVar = (C13645a.C13658c.C13663d) aVar;
            if ((!C11622t.isBlank(dVar.mo32492w())) || (!C11622t.isBlank(dVar.mo32493x())) || (!C11622t.isBlank(dVar.mo32491v()))) {
                ((C13220g) getBinding()).f32479w.setSelectedOption(DeliverySwitchComponent.SwitchOption.SECOND);
                Group group = ((C13220g) getBinding()).f32473q;
                Intrinsics.checkNotNullExpressionValue(group, "binding.deliveryApartmentGroup");
                group.setVisibility(0);
                return;
            }
            ((C13220g) getBinding()).f32479w.setSelectedOption(DeliverySwitchComponent.SwitchOption.FIRST);
            Group group2 = ((C13220g) getBinding()).f32473q;
            Intrinsics.checkNotNullExpressionValue(group2, "binding.deliveryApartmentGroup");
            group2.setVisibility(8);
        }
    }

    /* renamed from: g1 */
    public final void mo31811g1() {
        View view = getView();
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.f32824X);
        }
    }

    @C12579k
    public final C28936j getFragmentUtil() {
        C28936j jVar = this.f32830x;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fragmentUtil");
        return null;
    }

    /* renamed from: h1 */
    public final boolean mo31813h1(String str, String str2, String str3, String str4, String str5) {
        boolean z;
        boolean z2;
        if ((!C11622t.isBlank(str)) && (!C11622t.isBlank(str2)) && (!C11622t.isBlank(str3)) && str3.length() >= 2) {
            TextAreaComponent textAreaComponent = ((C13220g) getBinding()).f32453K;
            Intrinsics.checkNotNullExpressionValue(textAreaComponent, "binding.telephoneTextinput");
            if (textAreaComponent.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z || ((!C11622t.isBlank(str4)) && str4.length() == 10)) {
                TextAreaComponent textAreaComponent2 = ((C13220g) getBinding()).f32445C;
                Intrinsics.checkNotNullExpressionValue(textAreaComponent2, "binding.floorTextinput");
                if (textAreaComponent2.getVisibility() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    return true;
                }
                if ((!C11622t.isBlank(str5)) && str5.length() <= 3) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: i1 */
    public final boolean mo31814i1(C13645a.C13658c.C13659a aVar) {
        if (!Intrinsics.areEqual((Object) StringKt.m118926f(String.valueOf(((C13220g) getBinding()).f32465i.getText())), (Object) aVar.getAddress()) || !Intrinsics.areEqual((Object) StringKt.m118926f(String.valueOf(((C13220g) getBinding()).f32470n.getText())), (Object) aVar.getCity()) || !Intrinsics.areEqual((Object) StringKt.m118926f(String.valueOf(((C13220g) getBinding()).f32450H.getText())), (Object) aVar.getPostcode()) || !Intrinsics.areEqual((Object) StringKt.m118926f(String.valueOf(((C13220g) getBinding()).f32454L.getText())), (Object) aVar.mo32453c())) {
            return false;
        }
        return true;
    }

    public final void initHeader() {
        ((C13220g) getBinding()).f32455M.setContent(C8553b.m31049c(145900644, true, new UpdateUserAddressFragment$initHeader$1(this)));
    }

    public final void initListeners() {
        ((C13220g) getBinding()).f32451I.setOnClickListener(new C13460e(this));
    }

    /* renamed from: j1 */
    public final void mo31817j1(boolean z) {
        C13220g gVar = (C13220g) getBinding();
        if (z) {
            gVar.f32465i.setEnabled(true);
        }
        gVar.f32450H.setEnabled(z);
        gVar.f32470n.setEnabled(z);
        gVar.f32472p.setEnabled(z);
        gVar.f32479w.setEnabled(z);
        gVar.f32454L.setEnabled(z);
        gVar.f32468l.setEnabled(z);
        gVar.f32443A.setEnabled(z);
        gVar.f32448F.setEnabled(z);
        gVar.f32446D.setEnabled(z);
        gVar.f32478v.setEnabled(z);
    }

    /* renamed from: k1 */
    public final void mo31818k1(boolean z) {
        ((C13220g) getBinding()).f32451I.setEnabled(z);
    }

    /* renamed from: l1 */
    public final Address mo31819l1() {
        AddressCategory addressCategory;
        String str;
        boolean z;
        String str2;
        boolean z2;
        String str3;
        boolean z3;
        String str4;
        boolean z4;
        String str5;
        boolean z5;
        Editable text;
        String obj;
        if (mo31830x1()) {
            addressCategory = AddressCategory.DELIVERY;
        } else {
            addressCategory = AddressCategory.BILLING;
        }
        AddressCategory addressCategory2 = addressCategory;
        String f = StringKt.m118926f(String.valueOf(((C13220g) getBinding()).f32465i.getText()));
        String f2 = StringKt.m118926f(String.valueOf(((C13220g) getBinding()).f32450H.getText()));
        String f3 = StringKt.m118926f(String.valueOf(((C13220g) getBinding()).f32470n.getText()));
        if (mo31830x1() || (text = ((C13220g) getBinding()).f32472p.getText()) == null || (obj = text.toString()) == null) {
            str = "FR";
        } else {
            str = obj;
        }
        String f4 = StringKt.m118926f(String.valueOf(((C13220g) getBinding()).f32478v.getText()));
        TextAreaComponent textAreaComponent = ((C13220g) getBinding()).f32482z;
        Intrinsics.checkNotNullExpressionValue(textAreaComponent, "binding.digitalCodeTextinput");
        boolean z6 = true;
        if (textAreaComponent.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str2 = StringKt.m118926f(String.valueOf(((C13220g) getBinding()).f32443A.getText()));
        } else {
            str2 = "";
        }
        TextAreaComponent textAreaComponent2 = ((C13220g) getBinding()).f32447E;
        Intrinsics.checkNotNullExpressionValue(textAreaComponent2, "binding.interphoneTextinput");
        if (textAreaComponent2.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            str3 = StringKt.m118926f(String.valueOf(((C13220g) getBinding()).f32448F.getText()));
        } else {
            str3 = "";
        }
        TextAreaComponent textAreaComponent3 = ((C13220g) getBinding()).f32467k;
        Intrinsics.checkNotNullExpressionValue(textAreaComponent3, "binding.buildingTextinput");
        if (textAreaComponent3.getVisibility() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            str4 = StringKt.m118926f(String.valueOf(((C13220g) getBinding()).f32468l.getText()));
        } else {
            str4 = "";
        }
        TextAreaComponent textAreaComponent4 = ((C13220g) getBinding()).f32445C;
        Intrinsics.checkNotNullExpressionValue(textAreaComponent4, "binding.floorTextinput");
        if (textAreaComponent4.getVisibility() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            str5 = StringKt.m118926f(String.valueOf(((C13220g) getBinding()).f32446D.getText()));
        } else {
            str5 = "";
        }
        RadioGroup radioGroup = ((C13220g) getBinding()).f32474r;
        Intrinsics.checkNotNullExpressionValue(radioGroup, "binding.deliveryElevatorRadiogroup");
        if (radioGroup.getVisibility() != 0) {
            z6 = false;
        }
        if (z6) {
            z5 = ((C13220g) getBinding()).f32480x.isChecked();
        } else {
            z5 = false;
        }
        return new Address(str, (String) null, (String) null, f3, f, f2, str2, str3, z5, str4, str5, f4, (String) null, addressCategory2, 0, false, 0.0d, 0.0d, (Boolean) null, (String) null, 1036294, (DefaultConstructorMarker) null);
    }

    /* renamed from: m1 */
    public final C13461f mo31820m1() {
        return (C13461f) this.f32827g.getValue();
    }

    /* renamed from: n1 */
    public final AccountAddressViewModel mo31821n1() {
        return (AccountAddressViewModel) this.f32826f.getValue();
    }

    /* renamed from: o1 */
    public final void mo31822o1(List<DQEAddressModel> list) {
        C13440b bVar;
        if (list.isEmpty()) {
            ((C13220g) getBinding()).f32444B.setVisibility(8);
            return;
        }
        ((C13220g) getBinding()).f32444B.setVisibility(0);
        RecyclerView recyclerView = ((C13220g) getBinding()).f32444B;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter instanceof C13440b) {
            bVar = (C13440b) adapter;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            bVar.mo31881o(list);
        }
        Intrinsics.checkNotNullExpressionValue(recyclerView, "handleDQESuggestions$lambda$10");
        ViewKt.m152123e(recyclerView, (Integer) null, false, (C11289a) null, 7, (Object) null);
    }

    public void onDestroyView() {
        ((C13220g) getBinding()).f32444B.setAdapter((RecyclerView.Adapter) null);
        ((C13220g) getBinding()).f32444B.setLayoutManager((RecyclerView.C20076o) null);
        super.onDestroyView();
    }

    public void onPause() {
        FragmentKt.m118832t(this);
        mo31804H1();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        FragmentKt.m118814b(this);
        mo31811g1();
    }

    public void onStart() {
        Window window = requireActivity().getWindow();
        if (window != null) {
            window.setSoftInputMode(16);
        }
        super.onStart();
    }

    public void onStop() {
        Window window = requireActivity().getWindow();
        if (window != null) {
            window.setSoftInputMode(48);
        }
        super.onStop();
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        FragmentKt.m118815c(this, new UpdateUserAddressFragment$onViewCreated$1(this));
        AccountAddressViewModel n1 = mo31821n1();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new UpdateUserAddressFragment$onViewCreated$$inlined$processEvent$1(this, n1, (C11045c) null, this), 3, (Object) null);
        AccountAddressViewModel n12 = mo31821n1();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new UpdateUserAddressFragment$onViewCreated$$inlined$processState$1(this, n12, (C11045c) null, this), 3, (Object) null);
        initHeader();
        mo31827t1();
        mo31825s1();
        initListeners();
        mo31799B1();
        if (mo31830x1()) {
            mo31821n1().mo31588z();
        } else {
            mo31821n1().mo31586L();
        }
    }

    /* renamed from: p1 */
    public final void mo31823p1(Boolean bool) {
        if (Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE)) {
            ShimmerFrameLayout shimmerFrameLayout = ((C13220g) getBinding()).f32452J;
            shimmerFrameLayout.mo36996g();
            shimmerFrameLayout.setVisibility(0);
            ((C13220g) getBinding()).f32451I.setLoading(true);
            mo31817j1(false);
            return;
        }
        ShimmerFrameLayout shimmerFrameLayout2 = ((C13220g) getBinding()).f32452J;
        shimmerFrameLayout2.mo36997h();
        shimmerFrameLayout2.setVisibility(8);
        ((C13220g) getBinding()).f32451I.setLoading(false);
        mo31817j1(true);
    }

    /* renamed from: q1 */
    public final void mo31824q1() {
        if (mo31820m1().mo31924o()) {
            C19736g.m91827a(this).mo58156s0();
        }
        C19736g.m91827a(this).mo58152q0();
    }

    /* renamed from: s1 */
    public final void mo31825s1() {
        TextInputEditText textInputEditText = ((C13220g) getBinding()).f32465i;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "initOnFocusChangeListeners$lambda$35");
        C11907e<R> X0 = C11909g.m47418X0(C11909g.m47427a0(C11909g.m47448f1(C11909g.m47451g0(EditTextKt.m152108b(textInputEditText)), new UpdateUserAddressFragment$initOnFocusChangeListeners$1$1(this, (C11045c<? super UpdateUserAddressFragment$initOnFocusChangeListeners$1$1>) null)), 500), new UpdateUserAddressFragment$initOnFocusChangeListeners$1$2(this, textInputEditText, (C11045c<? super UpdateUserAddressFragment$initOnFocusChangeListeners$1$2>) null));
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner, X0, new C13412x56d25f3e((C11045c) null));
        TextInputEditText textInputEditText2 = ((C13220g) getBinding()).f32470n;
        Intrinsics.checkNotNullExpressionValue(textInputEditText2, "binding.cityTextinputEdittext");
        com.carrefour.fid.android.shared.extension.EditTextKt.m118798h(textInputEditText2, new UpdateUserAddressFragment$initOnFocusChangeListeners$2(this));
        TextInputEditText textInputEditText3 = ((C13220g) getBinding()).f32450H;
        Intrinsics.checkNotNullExpressionValue(textInputEditText3, "binding.postalCodeTextinputEdittext");
        com.carrefour.fid.android.shared.extension.EditTextKt.m118798h(textInputEditText3, new UpdateUserAddressFragment$initOnFocusChangeListeners$3(this));
        TextInputEditText textInputEditText4 = ((C13220g) getBinding()).f32454L;
        Intrinsics.checkNotNullExpressionValue(textInputEditText4, "binding.telephoneTextinputEdittext");
        com.carrefour.fid.android.shared.extension.EditTextKt.m118798h(textInputEditText4, new UpdateUserAddressFragment$initOnFocusChangeListeners$4(this));
        TextInputEditText textInputEditText5 = ((C13220g) getBinding()).f32446D;
        Intrinsics.checkNotNullExpressionValue(textInputEditText5, "binding.floorTextinputEdittext");
        com.carrefour.fid.android.shared.extension.EditTextKt.m118798h(textInputEditText5, new UpdateUserAddressFragment$initOnFocusChangeListeners$5(this));
        TextInputEditText textInputEditText6 = ((C13220g) getBinding()).f32478v;
        Intrinsics.checkNotNullExpressionValue(textInputEditText6, "binding.deliveryNoteTextinputEdittext");
        C11907e<String> f1 = C11909g.m47448f1(EditTextKt.m152108b(textInputEditText6), new UpdateUserAddressFragment$initOnFocusChangeListeners$6(this, (C11045c<? super UpdateUserAddressFragment$initOnFocusChangeListeners$6>) null));
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner2, f1, new C13411x8bd25c19((C11045c) null));
    }

    public final void setFragmentUtil(@C12579k C28936j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.f32830x = jVar;
    }

    /* renamed from: t1 */
    public final void mo31827t1() {
        MaterialAutoCompleteTextView materialAutoCompleteTextView;
        getFragmentUtil().mo32776b(this);
        ((C13220g) getBinding()).f32477u.setHelperText(getString(C13144b.C13163s.account_form_address_remaining_characters, "79"));
        if (mo31830x1()) {
            Group group = ((C13220g) getBinding()).f32475s;
            Intrinsics.checkNotNullExpressionValue(group, "binding.deliveryGroup");
            group.setVisibility(0);
            Group group2 = ((C13220g) getBinding()).f32466j;
            Intrinsics.checkNotNullExpressionValue(group2, "binding.billingSwitchGroup");
            group2.setVisibility(8);
            ((C13220g) getBinding()).f32463g.setText(getString(C13144b.C13163s.account_form_address_title_delivery));
            ((C13220g) getBinding()).f32464h.setHint((CharSequence) getString(C13144b.C13163s.account_form_address_field_title_delivery));
            ((C13220g) getBinding()).f32479w.setOnOptionChangedListener(new UpdateUserAddressFragment$initView$1(this));
            TextAreaComponent textAreaComponent = ((C13220g) getBinding()).f32471o;
            textAreaComponent.setEnabled(false);
            textAreaComponent.setEndIconMode(0);
            Drawable startIconDrawable = textAreaComponent.getStartIconDrawable();
            if (startIconDrawable != null) {
                startIconDrawable.setAlpha(128);
            }
        } else {
            Group group3 = ((C13220g) getBinding()).f32475s;
            Intrinsics.checkNotNullExpressionValue(group3, "binding.deliveryGroup");
            group3.setVisibility(8);
            ((C13220g) getBinding()).f32463g.setText(getString(C13144b.C13163s.account_form_address_title_bill));
            ((C13220g) getBinding()).f32464h.setHint((CharSequence) getString(C13144b.C13163s.account_form_address_field_title_billing));
            EditText editText = ((C13220g) getBinding()).f32471o.getEditText();
            if (editText instanceof MaterialAutoCompleteTextView) {
                materialAutoCompleteTextView = (MaterialAutoCompleteTextView) editText;
            } else {
                materialAutoCompleteTextView = null;
            }
            if (materialAutoCompleteTextView != null) {
                Context context = materialAutoCompleteTextView.getContext();
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.content.Context");
                materialAutoCompleteTextView.setAdapter(new ArrayAdapter(context, 17367049, materialAutoCompleteTextView.getResources().getStringArray(C13144b.C13147c.list_country)));
                materialAutoCompleteTextView.setOnItemClickListener(new C13458c(this));
            }
            ((C13220g) getBinding()).f32459c.setOnCheckedChangeListener(new UpdateUserAddressFragment$initView$4(this));
        }
        RecyclerView recyclerView = ((C13220g) getBinding()).f32444B;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireView().getContext()));
        recyclerView.setAdapter(new C13440b(this.f32831y, (List) null, 2, (DefaultConstructorMarker) null));
        recyclerView.mo59589n(new C28852a(1, true, 0, 4, (DefaultConstructorMarker) null));
    }

    /* renamed from: v1 */
    public final boolean mo31828v1(String str) {
        boolean z;
        String str2;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        TextAreaComponent textAreaComponent = ((C13220g) getBinding()).f32464h;
        if (!z) {
            str2 = getString(C13144b.C13163s.account_form_address_error);
        } else {
            str2 = null;
        }
        textAreaComponent.setError(str2);
        return z;
    }

    /* renamed from: w1 */
    public final boolean mo31829w1(String str) {
        boolean z;
        String str2;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        TextAreaComponent textAreaComponent = ((C13220g) getBinding()).f32469m;
        if (!z) {
            str2 = getString(C13144b.C13163s.account_form_address_city_error);
        } else {
            str2 = null;
        }
        textAreaComponent.setError(str2);
        return z;
    }

    /* renamed from: x1 */
    public final boolean mo31830x1() {
        return ((Boolean) this.f32828v.getValue()).booleanValue();
    }

    /* renamed from: y1 */
    public final boolean mo31831y1(String str) {
        boolean z;
        String str2;
        boolean z2 = true;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || str.length() > 3) {
            z2 = false;
        }
        TextAreaComponent textAreaComponent = ((C13220g) getBinding()).f32445C;
        if (!z2) {
            str2 = getString(C13144b.C13163s.account_form_address_floor_error);
        } else {
            str2 = null;
        }
        textAreaComponent.setError(str2);
        return z2;
    }

    /* renamed from: z1 */
    public final boolean mo31832z1(String str) {
        String str2;
        boolean N = StringKt.m118905N(str);
        TextAreaComponent textAreaComponent = ((C13220g) getBinding()).f32453K;
        if (!N) {
            str2 = getString(C13144b.C13163s.account_form_address_telephone_error);
        } else {
            str2 = null;
        }
        textAreaComponent.setError(str2);
        return N;
    }
}
