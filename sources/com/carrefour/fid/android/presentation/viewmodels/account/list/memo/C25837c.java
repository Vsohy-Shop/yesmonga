package com.carrefour.fid.android.presentation.viewmodels.account.list.memo;

import com.carrefour.fid.android.data.managers.ClearAppManager;
import com.carrefour.fid.android.domain.interactors.account.store.memo.AddMemoListUseCase;
import com.carrefour.fid.android.domain.interactors.account.store.memo.ClearMemoListUseCase;
import com.carrefour.fid.android.domain.interactors.account.store.memo.DeleteMemoListUseCase;
import com.carrefour.fid.android.domain.interactors.account.store.memo.GetMemoListUseCase;
import com.carrefour.fid.android.domain.interactors.account.store.memo.UpdateMemoListUseCase;
import com.carrefour.fid.android.domain.interactors.product.search.SearchWithListUseCase;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.list.memo.c */
public final class C25837c implements C10324h<MemoListViewModel> {

    /* renamed from: a */
    public final Provider<AddMemoListUseCase> f63274a;

    /* renamed from: b */
    public final Provider<ClearMemoListUseCase> f63275b;

    /* renamed from: c */
    public final Provider<DeleteMemoListUseCase> f63276c;

    /* renamed from: d */
    public final Provider<GetMemoListUseCase> f63277d;

    /* renamed from: e */
    public final Provider<UpdateMemoListUseCase> f63278e;

    /* renamed from: f */
    public final Provider<SearchWithListUseCase> f63279f;

    /* renamed from: g */
    public final Provider<ClearAppManager> f63280g;

    public C25837c(Provider<AddMemoListUseCase> provider, Provider<ClearMemoListUseCase> provider2, Provider<DeleteMemoListUseCase> provider3, Provider<GetMemoListUseCase> provider4, Provider<UpdateMemoListUseCase> provider5, Provider<SearchWithListUseCase> provider6, Provider<ClearAppManager> provider7) {
        this.f63274a = provider;
        this.f63275b = provider2;
        this.f63276c = provider3;
        this.f63277d = provider4;
        this.f63278e = provider5;
        this.f63279f = provider6;
        this.f63280g = provider7;
    }

    /* renamed from: a */
    public static C25837c m110785a(Provider<AddMemoListUseCase> provider, Provider<ClearMemoListUseCase> provider2, Provider<DeleteMemoListUseCase> provider3, Provider<GetMemoListUseCase> provider4, Provider<UpdateMemoListUseCase> provider5, Provider<SearchWithListUseCase> provider6, Provider<ClearAppManager> provider7) {
        return new C25837c(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    /* renamed from: c */
    public static MemoListViewModel m110786c(AddMemoListUseCase addMemoListUseCase, ClearMemoListUseCase clearMemoListUseCase, DeleteMemoListUseCase deleteMemoListUseCase, GetMemoListUseCase getMemoListUseCase, UpdateMemoListUseCase updateMemoListUseCase, SearchWithListUseCase searchWithListUseCase, ClearAppManager clearAppManager) {
        return new MemoListViewModel(addMemoListUseCase, clearMemoListUseCase, deleteMemoListUseCase, getMemoListUseCase, updateMemoListUseCase, searchWithListUseCase, clearAppManager);
    }

    /* renamed from: b */
    public MemoListViewModel get() {
        return m110786c(this.f63274a.get(), this.f63275b.get(), this.f63276c.get(), this.f63277d.get(), this.f63278e.get(), this.f63279f.get(), this.f63280g.get());
    }
}
