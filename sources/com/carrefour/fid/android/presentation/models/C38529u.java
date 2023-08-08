package com.carrefour.fid.android.presentation.models;

import androidx.compose.runtime.internal.C8567o;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.models.u */
public final class C38529u {

    /* renamed from: d */
    public static final int f97665d = 8;
    @C12579k

    /* renamed from: a */
    public final SuggestionType f97666a;
    @C12580l

    /* renamed from: b */
    public final List<C38530v> f97667b;
    @C12580l

    /* renamed from: c */
    public final List<C38530v> f97668c;

    public C38529u(@C12579k SuggestionType suggestionType, @C12580l List<C38530v> list, @C12580l List<C38530v> list2) {
        Intrinsics.checkNotNullParameter(suggestionType, "type");
        this.f97666a = suggestionType;
        this.f97667b = list;
        this.f97668c = list2;
    }

    /* renamed from: e */
    public static /* synthetic */ C38529u m159821e(C38529u uVar, SuggestionType suggestionType, List<C38530v> list, List<C38530v> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            suggestionType = uVar.f97666a;
        }
        if ((i & 2) != 0) {
            list = uVar.f97667b;
        }
        if ((i & 4) != 0) {
            list2 = uVar.f97668c;
        }
        return uVar.mo122166d(suggestionType, list, list2);
    }

    @C12579k
    /* renamed from: a */
    public final SuggestionType mo122163a() {
        return this.f97666a;
    }

    @C12580l
    /* renamed from: b */
    public final List<C38530v> mo122164b() {
        return this.f97667b;
    }

    @C12580l
    /* renamed from: c */
    public final List<C38530v> mo122165c() {
        return this.f97668c;
    }

    @C12579k
    /* renamed from: d */
    public final C38529u mo122166d(@C12579k SuggestionType suggestionType, @C12580l List<C38530v> list, @C12580l List<C38530v> list2) {
        Intrinsics.checkNotNullParameter(suggestionType, "type");
        return new C38529u(suggestionType, list, list2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38529u)) {
            return false;
        }
        C38529u uVar = (C38529u) obj;
        return this.f97666a == uVar.f97666a && Intrinsics.areEqual((Object) this.f97667b, (Object) uVar.f97667b) && Intrinsics.areEqual((Object) this.f97668c, (Object) uVar.f97668c);
    }

    @C12580l
    /* renamed from: f */
    public final List<C38530v> mo122168f() {
        return this.f97667b;
    }

    @C12580l
    /* renamed from: g */
    public final List<C38530v> mo122169g() {
        return this.f97668c;
    }

    @C12579k
    /* renamed from: h */
    public final SuggestionType mo122170h() {
        return this.f97666a;
    }

    public int hashCode() {
        int hashCode = this.f97666a.hashCode() * 31;
        List<C38530v> list = this.f97667b;
        int i = 0;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<C38530v> list2 = this.f97668c;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode2 + i;
    }

    @C12579k
    public String toString() {
        SuggestionType suggestionType = this.f97666a;
        List<C38530v> list = this.f97667b;
        List<C38530v> list2 = this.f97668c;
        return "SuggestionListModel(type=" + suggestionType + ", filteredSuggestion=" + list + ", suggestions=" + list2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38529u(SuggestionType suggestionType, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(suggestionType, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2);
    }
}
