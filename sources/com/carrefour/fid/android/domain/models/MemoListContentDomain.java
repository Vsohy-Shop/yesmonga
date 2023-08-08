package com.carrefour.fid.android.domain.models;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.presentation.models.C38495l;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0011\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003J'\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/MemoListContentDomain;", "", "Lcom/carrefour/fid/android/domain/models/MemoListInfoDomain;", "component1", "", "Lcom/carrefour/fid/android/presentation/models/l;", "component2", "shoppingListMetadata", "items", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/carrefour/fid/android/domain/models/MemoListInfoDomain;", "getShoppingListMetadata", "()Lcom/carrefour/fid/android/domain/models/MemoListInfoDomain;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "<init>", "(Lcom/carrefour/fid/android/domain/models/MemoListInfoDomain;Ljava/util/List;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@Keep
@C8567o(parameters = 0)
public final class MemoListContentDomain {
    public static final int $stable = 8;
    @C33608c("items")
    @C12580l
    private final List<C38495l> items;
    @C33608c("list_id")
    @C12580l
    private final MemoListInfoDomain shoppingListMetadata;

    public MemoListContentDomain() {
        this((MemoListInfoDomain) null, (List) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ MemoListContentDomain copy$default(MemoListContentDomain memoListContentDomain, MemoListInfoDomain memoListInfoDomain, List<C38495l> list, int i, Object obj) {
        if ((i & 1) != 0) {
            memoListInfoDomain = memoListContentDomain.shoppingListMetadata;
        }
        if ((i & 2) != 0) {
            list = memoListContentDomain.items;
        }
        return memoListContentDomain.copy(memoListInfoDomain, list);
    }

    @C12580l
    public final MemoListInfoDomain component1() {
        return this.shoppingListMetadata;
    }

    @C12580l
    public final List<C38495l> component2() {
        return this.items;
    }

    @C12579k
    public final MemoListContentDomain copy(@C12580l MemoListInfoDomain memoListInfoDomain, @C12580l List<C38495l> list) {
        return new MemoListContentDomain(memoListInfoDomain, list);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MemoListContentDomain)) {
            return false;
        }
        MemoListContentDomain memoListContentDomain = (MemoListContentDomain) obj;
        return Intrinsics.areEqual((Object) this.shoppingListMetadata, (Object) memoListContentDomain.shoppingListMetadata) && Intrinsics.areEqual((Object) this.items, (Object) memoListContentDomain.items);
    }

    @C12580l
    public final List<C38495l> getItems() {
        return this.items;
    }

    @C12580l
    public final MemoListInfoDomain getShoppingListMetadata() {
        return this.shoppingListMetadata;
    }

    public int hashCode() {
        MemoListInfoDomain memoListInfoDomain = this.shoppingListMetadata;
        int i = 0;
        int hashCode = (memoListInfoDomain == null ? 0 : memoListInfoDomain.hashCode()) * 31;
        List<C38495l> list = this.items;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        MemoListInfoDomain memoListInfoDomain = this.shoppingListMetadata;
        List<C38495l> list = this.items;
        return "MemoListContentDomain(shoppingListMetadata=" + memoListInfoDomain + ", items=" + list + ")";
    }

    public MemoListContentDomain(@C12580l MemoListInfoDomain memoListInfoDomain, @C12580l List<C38495l> list) {
        this.shoppingListMetadata = memoListInfoDomain;
        this.items = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MemoListContentDomain(MemoListInfoDomain memoListInfoDomain, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : memoListInfoDomain, (i & 2) != 0 ? null : list);
    }
}
