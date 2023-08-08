package com.carrefour.fid.android.presentation.models;

import androidx.compose.runtime.internal.C8567o;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.models.v */
public final class C38530v {

    /* renamed from: f */
    public static final int f97669f = 8;
    @C12579k

    /* renamed from: a */
    public final SuggestionType f97670a;
    @C12579k

    /* renamed from: b */
    public final String f97671b;
    @C12580l

    /* renamed from: c */
    public final String f97672c;
    @C12580l

    /* renamed from: d */
    public final List<String> f97673d;
    @C12580l

    /* renamed from: e */
    public final C38528t f97674e;

    public C38530v(@C12579k SuggestionType suggestionType, @C12579k String str, @C12580l String str2, @C12580l List<String> list, @C12580l C38528t tVar) {
        Intrinsics.checkNotNullParameter(suggestionType, "type");
        Intrinsics.checkNotNullParameter(str, "text");
        this.f97670a = suggestionType;
        this.f97671b = str;
        this.f97672c = str2;
        this.f97673d = list;
        this.f97674e = tVar;
    }

    /* renamed from: g */
    public static /* synthetic */ C38530v m159829g(C38530v vVar, SuggestionType suggestionType, String str, String str2, List<String> list, C38528t tVar, int i, Object obj) {
        if ((i & 1) != 0) {
            suggestionType = vVar.f97670a;
        }
        if ((i & 2) != 0) {
            str = vVar.f97671b;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = vVar.f97672c;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            list = vVar.f97673d;
        }
        List<String> list2 = list;
        if ((i & 16) != 0) {
            tVar = vVar.f97674e;
        }
        return vVar.mo122179f(suggestionType, str3, str4, list2, tVar);
    }

    @C12579k
    /* renamed from: a */
    public final SuggestionType mo122173a() {
        return this.f97670a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo122174b() {
        return this.f97671b;
    }

    @C12580l
    /* renamed from: c */
    public final String mo122175c() {
        return this.f97672c;
    }

    @C12580l
    /* renamed from: d */
    public final List<String> mo122176d() {
        return this.f97673d;
    }

    @C12580l
    /* renamed from: e */
    public final C38528t mo122177e() {
        return this.f97674e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38530v)) {
            return false;
        }
        C38530v vVar = (C38530v) obj;
        return this.f97670a == vVar.f97670a && Intrinsics.areEqual((Object) this.f97671b, (Object) vVar.f97671b) && Intrinsics.areEqual((Object) this.f97672c, (Object) vVar.f97672c) && Intrinsics.areEqual((Object) this.f97673d, (Object) vVar.f97673d) && Intrinsics.areEqual((Object) this.f97674e, (Object) vVar.f97674e);
    }

    @C12579k
    /* renamed from: f */
    public final C38530v mo122179f(@C12579k SuggestionType suggestionType, @C12579k String str, @C12580l String str2, @C12580l List<String> list, @C12580l C38528t tVar) {
        Intrinsics.checkNotNullParameter(suggestionType, "type");
        Intrinsics.checkNotNullParameter(str, "text");
        return new C38530v(suggestionType, str, str2, list, tVar);
    }

    @C12580l
    /* renamed from: h */
    public final C38528t mo122180h() {
        return this.f97674e;
    }

    public int hashCode() {
        int hashCode = ((this.f97670a.hashCode() * 31) + this.f97671b.hashCode()) * 31;
        String str = this.f97672c;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.f97673d;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        C38528t tVar = this.f97674e;
        if (tVar != null) {
            i = tVar.hashCode();
        }
        return hashCode3 + i;
    }

    @C12580l
    /* renamed from: i */
    public final String mo122182i() {
        return this.f97672c;
    }

    @C12580l
    /* renamed from: j */
    public final List<String> mo122183j() {
        return this.f97673d;
    }

    @C12579k
    /* renamed from: k */
    public final String mo122184k() {
        return this.f97671b;
    }

    @C12579k
    /* renamed from: l */
    public final SuggestionType mo122185l() {
        return this.f97670a;
    }

    @C12579k
    public String toString() {
        SuggestionType suggestionType = this.f97670a;
        String str = this.f97671b;
        String str2 = this.f97672c;
        List<String> list = this.f97673d;
        C38528t tVar = this.f97674e;
        return "SuggestionModel(type=" + suggestionType + ", text=" + str + ", highlight=" + str2 + ", matches=" + list + ", facetFilter=" + tVar + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38530v(SuggestionType suggestionType, String str, String str2, List list, C38528t tVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(suggestionType, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : tVar);
    }
}
