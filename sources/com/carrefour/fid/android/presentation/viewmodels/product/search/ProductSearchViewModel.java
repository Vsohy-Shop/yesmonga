package com.carrefour.fid.android.presentation.viewmodels.product.search;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19500w0;
import androidx.lifecycle.LiveData;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.account.data.entities.extentions.C13181d;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.domain.interactors.product.search.AddSearchHistoryUseCase;
import com.carrefour.fid.android.domain.interactors.product.search.ClearSearchHistoryUseCase;
import com.carrefour.fid.android.domain.interactors.product.search.GetProductSearchSuggestionsUseCase;
import com.carrefour.fid.android.domain.interactors.product.search.GetSearchHistoryUseCase;
import com.carrefour.fid.android.domain.interactors.product.search.SearchWithListRemoteConfigUseCase;
import com.carrefour.fid.android.presentation.models.C38528t;
import com.carrefour.fid.android.presentation.models.C38529u;
import com.carrefour.fid.android.presentation.models.C38530v;
import com.carrefour.fid.android.presentation.models.SuggestionType;
import com.carrefour.fid.android.scan.core.datastore.ScanPreferencesStorage;
import com.carrefour.fid.android.shared.base.C28498p;
import com.carrefour.fid.android.shared.constant.C28513a;
import com.carrefour.fid.android.shared.util.C28947q;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020(\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00103\u001a\u000200\u0012\u0006\u00107\u001a\u000204\u0012\u0006\u0010;\u001a\u000208¢\u0006\u0004\bQ\u0010RJ \u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0006J \u0010\t\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0006J\b\u0010\u000b\u001a\u00020\nH\u0002J!\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u000e\u001a\u00020\u0003H\u0014J\u000e\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0014\u001a\u00020\u0003J\u0006\u0010\u0015\u001a\u00020\u0003J\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u00182\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001aJ\u0006\u0010\u001d\u001a\u00020\u0003J\u0006\u0010\u001f\u001a\u00020\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u001c\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0<8\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001c\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0<8\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010>R.\u0010J\u001a\u0004\u0018\u00010B2\b\u0010C\u001a\u0004\u0018\u00010B8\u0006@FX\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001c\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0K8@X\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u001c\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0K8@X\u0004¢\u0006\u0006\u001a\u0004\bO\u0010M\u0002\u0004\n\u0002\b\u0019¨\u0006S"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/product/search/ProductSearchViewModel;", "Lcom/carrefour/fid/android/shared/base/p;", "Lkotlin/Result;", "Lkotlin/d2;", "result", "z0", "(Ljava/lang/Object;)V", "A0", "Lcom/carrefour/fid/android/presentation/models/u;", "B0", "", "C0", "Landroidx/lifecycle/w;", "owner", "clear", "r", "(Landroidx/lifecycle/w;Ljava/lang/Boolean;)V", "Lcom/carrefour/fid/android/presentation/models/v;", "suggestion", "s0", "u0", "D0", "Landroid/content/Context;", "context", "", "v0", "", "searchTerms", "E0", "t0", "Lkotlinx/coroutines/c2;", "G0", "Lcom/carrefour/fid/android/domain/interactors/product/search/GetProductSearchSuggestionsUseCase;", "d", "Lcom/carrefour/fid/android/domain/interactors/product/search/GetProductSearchSuggestionsUseCase;", "getProductSearchSuggestionsUseCase", "Lcom/carrefour/fid/android/domain/interactors/product/search/AddSearchHistoryUseCase;", "e", "Lcom/carrefour/fid/android/domain/interactors/product/search/AddSearchHistoryUseCase;", "addSearchHistoryUseCase", "Lcom/carrefour/fid/android/domain/interactors/product/search/ClearSearchHistoryUseCase;", "f", "Lcom/carrefour/fid/android/domain/interactors/product/search/ClearSearchHistoryUseCase;", "clearSearchHistoryUseCase", "Lcom/carrefour/fid/android/domain/interactors/product/search/GetSearchHistoryUseCase;", "g", "Lcom/carrefour/fid/android/domain/interactors/product/search/GetSearchHistoryUseCase;", "getSearchHistoryUseCase", "Lcom/carrefour/fid/android/domain/interactors/product/search/SearchWithListRemoteConfigUseCase;", "h", "Lcom/carrefour/fid/android/domain/interactors/product/search/SearchWithListRemoteConfigUseCase;", "searchWithListRemoteConfigUseCase", "Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;", "i", "Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;", "loginRepository", "Lcom/carrefour/fid/android/scan/core/datastore/ScanPreferencesStorage;", "j", "Lcom/carrefour/fid/android/scan/core/datastore/ScanPreferencesStorage;", "scanPreferencesStorage", "Lcom/carrefour/fid/android/shared/util/q;", "k", "Lcom/carrefour/fid/android/shared/util/q;", "singleResults", "l", "singleSearchWithListAvailability", "Landroid/os/Bundle;", "value", "m", "Landroid/os/Bundle;", "w0", "()Landroid/os/Bundle;", "F0", "(Landroid/os/Bundle;)V", "productListSettings", "Landroidx/lifecycle/LiveData;", "x0", "()Landroidx/lifecycle/LiveData;", "results", "y0", "searchWithListAvailability", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/product/search/GetProductSearchSuggestionsUseCase;Lcom/carrefour/fid/android/domain/interactors/product/search/AddSearchHistoryUseCase;Lcom/carrefour/fid/android/domain/interactors/product/search/ClearSearchHistoryUseCase;Lcom/carrefour/fid/android/domain/interactors/product/search/GetSearchHistoryUseCase;Lcom/carrefour/fid/android/domain/interactors/product/search/SearchWithListRemoteConfigUseCase;Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;Lcom/carrefour/fid/android/scan/core/datastore/ScanPreferencesStorage;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nProductSearchViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductSearchViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/product/search/ProductSearchViewModel\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,175:1\n11335#2:176\n11670#2,3:177\n*S KotlinDebug\n*F\n+ 1 ProductSearchViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/product/search/ProductSearchViewModel\n*L\n104#1:176\n104#1:177,3\n*E\n"})
public final class ProductSearchViewModel extends C28498p {

    /* renamed from: n */
    public static final int f66201n = 8;
    @C12579k

    /* renamed from: d */
    public final GetProductSearchSuggestionsUseCase f66202d;
    @C12579k

    /* renamed from: e */
    public final AddSearchHistoryUseCase f66203e;
    @C12579k

    /* renamed from: f */
    public final ClearSearchHistoryUseCase f66204f;
    @C12579k

    /* renamed from: g */
    public final GetSearchHistoryUseCase f66205g;
    @C12579k

    /* renamed from: h */
    public final SearchWithListRemoteConfigUseCase f66206h;
    @C12579k

    /* renamed from: i */
    public final LoginRepository f66207i;
    @C12579k

    /* renamed from: j */
    public ScanPreferencesStorage f66208j;
    @C12579k

    /* renamed from: k */
    public final C28947q<C38529u> f66209k = new C28947q<>();
    @C12579k

    /* renamed from: l */
    public final C28947q<Boolean> f66210l = new C28947q<>();
    @C12580l

    /* renamed from: m */
    public Bundle f66211m;

    @Inject
    public ProductSearchViewModel(@C12579k GetProductSearchSuggestionsUseCase getProductSearchSuggestionsUseCase, @C12579k AddSearchHistoryUseCase addSearchHistoryUseCase, @C12579k ClearSearchHistoryUseCase clearSearchHistoryUseCase, @C12579k GetSearchHistoryUseCase getSearchHistoryUseCase, @C12579k SearchWithListRemoteConfigUseCase searchWithListRemoteConfigUseCase, @C12579k LoginRepository loginRepository, @C12579k ScanPreferencesStorage scanPreferencesStorage) {
        Intrinsics.checkNotNullParameter(getProductSearchSuggestionsUseCase, "getProductSearchSuggestionsUseCase");
        Intrinsics.checkNotNullParameter(addSearchHistoryUseCase, "addSearchHistoryUseCase");
        Intrinsics.checkNotNullParameter(clearSearchHistoryUseCase, "clearSearchHistoryUseCase");
        Intrinsics.checkNotNullParameter(getSearchHistoryUseCase, "getSearchHistoryUseCase");
        Intrinsics.checkNotNullParameter(searchWithListRemoteConfigUseCase, "searchWithListRemoteConfigUseCase");
        Intrinsics.checkNotNullParameter(loginRepository, "loginRepository");
        Intrinsics.checkNotNullParameter(scanPreferencesStorage, "scanPreferencesStorage");
        this.f66202d = getProductSearchSuggestionsUseCase;
        this.f66203e = addSearchHistoryUseCase;
        this.f66204f = clearSearchHistoryUseCase;
        this.f66205g = getSearchHistoryUseCase;
        this.f66206h = searchWithListRemoteConfigUseCase;
        this.f66207i = loginRepository;
        this.f66208j = scanPreferencesStorage;
    }

    /* renamed from: A0 */
    public final void mo79237A0(Object obj) {
        mo83421f0().mo57493o(Boolean.FALSE);
        if (Result.m38709i(obj)) {
            mo83420e0().mo57493o(Result.m38705e(obj));
        }
        this.f66209k.mo57493o(new C38529u(SuggestionType.HISTORY, (List) null, (List) null, 6, (DefaultConstructorMarker) null));
    }

    /* renamed from: B0 */
    public final void mo79238B0(Object obj) {
        mo83421f0().mo57493o(Boolean.FALSE);
        if (Result.m38709i(obj)) {
            mo83420e0().mo57493o(Result.m38705e(obj));
            return;
        }
        C28947q<C38529u> qVar = this.f66209k;
        if (Result.m38709i(obj)) {
            obj = null;
        }
        qVar.mo57493o(obj);
    }

    /* renamed from: C0 */
    public final boolean mo79239C0() {
        return C13181d.m57146e(this.f66207i.mo31354f());
    }

    /* renamed from: D0 */
    public final void mo79240D0() {
        mo83421f0().mo57493o(Boolean.TRUE);
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new ProductSearchViewModel$loadHistory$1(this, (C11045c<? super ProductSearchViewModel$loadHistory$1>) null), 3, (Object) null);
    }

    /* renamed from: E0 */
    public final void mo79241E0(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "searchTerms");
        if (C11622t.isBlank(str)) {
            mo83420e0().mo57493o(new Throwable("Search terms are empty or blank"));
            return;
        }
        mo83421f0().mo57493o(Boolean.TRUE);
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new ProductSearchViewModel$search$1(this, str, (C11045c<? super ProductSearchViewModel$search$1>) null), 3, (Object) null);
    }

    /* renamed from: F0 */
    public final void mo79242F0(@C12580l Bundle bundle) {
        Bundle bundle2 = this.f66211m;
        if ((bundle2 != null || bundle == null) && (bundle2 == null || bundle != null)) {
            bundle = bundle2;
        }
        this.f66211m = bundle;
    }

    @C12579k
    /* renamed from: G0 */
    public final C11723c2 mo79243G0() {
        return C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new ProductSearchViewModel$updateScanTutorialVisibilityPreference$1(this, (C11045c<? super ProductSearchViewModel$updateScanTutorialVisibilityPreference$1>) null), 3, (Object) null);
    }

    public void clear() {
        super.clear();
        this.f66209k.mo57496r(null);
    }

    /* renamed from: r */
    public void mo74786r(@C12579k C19499w wVar, @C12580l Boolean bool) {
        Intrinsics.checkNotNullParameter(wVar, "owner");
        this.f66209k.mo57495q(wVar);
        mo79249x0().mo57495q(wVar);
        this.f66210l.mo57495q(wVar);
        mo79250y0().mo57495q(wVar);
        super.mo74786r(wVar, bool);
    }

    /* renamed from: s0 */
    public final void mo79244s0(@C12579k C38530v vVar) {
        Intrinsics.checkNotNullParameter(vVar, C28513a.f68684v);
        mo83421f0().mo57496r(Boolean.TRUE);
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new ProductSearchViewModel$addHistory$1(this, vVar, (C11045c<? super ProductSearchViewModel$addHistory$1>) null), 3, (Object) null);
    }

    /* renamed from: t0 */
    public final void mo79245t0() {
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new ProductSearchViewModel$checkSearchWithListAvailability$1(this, (C11045c<? super ProductSearchViewModel$checkSearchWithListAvailability$1>) null), 3, (Object) null);
    }

    /* renamed from: u0 */
    public final void mo79246u0() {
        mo83421f0().mo57496r(Boolean.TRUE);
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new ProductSearchViewModel$clearHistory$1(this, (C11045c<? super ProductSearchViewModel$clearHistory$1>) null), 3, (Object) null);
    }

    @C12579k
    /* renamed from: v0 */
    public final List<C38530v> mo79247v0(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        String[] stringArray = context.getResources().getStringArray(R.array.default_search_list);
        Intrinsics.checkNotNullExpressionValue(stringArray, "context.resources.getStr…rray.default_search_list)");
        ArrayList arrayList = new ArrayList(stringArray.length);
        for (String str : stringArray) {
            SuggestionType suggestionType = SuggestionType.FREQUENT;
            Intrinsics.checkNotNullExpressionValue(str, C28513a.f68684v);
            arrayList.add(new C38530v(suggestionType, str, (String) null, (List) null, (C38528t) null, 28, (DefaultConstructorMarker) null));
        }
        return arrayList;
    }

    @C12580l
    /* renamed from: w0 */
    public final Bundle mo79248w0() {
        return this.f66211m;
    }

    @C12579k
    /* renamed from: x0 */
    public final LiveData<C38529u> mo79249x0() {
        return this.f66209k;
    }

    @C12579k
    /* renamed from: y0 */
    public final LiveData<Boolean> mo79250y0() {
        return this.f66210l;
    }

    /* renamed from: z0 */
    public final void mo79251z0(Object obj) {
        if (Result.m38709i(obj)) {
            mo79240D0();
        } else {
            mo83421f0().mo57493o(Boolean.FALSE);
        }
    }
}
