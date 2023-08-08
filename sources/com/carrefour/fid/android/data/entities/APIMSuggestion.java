package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B;\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003JG\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/APIMSuggestion;", "", "highlight", "", "", "text", "matches", "facetFilter", "Lcom/carrefour/fid/android/data/entities/APIMSuggestionFacetFilter;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/carrefour/fid/android/data/entities/APIMSuggestionFacetFilter;)V", "getFacetFilter", "()Lcom/carrefour/fid/android/data/entities/APIMSuggestionFacetFilter;", "getHighlight", "()Ljava/util/List;", "getMatches", "getText", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class APIMSuggestion {
    public static final int $stable = 8;
    @C33608c("facetFilter")
    @C12580l
    private final APIMSuggestionFacetFilter facetFilter;
    @C33608c("highlight")
    @C12579k
    private final List<String> highlight;
    @C33608c("matches")
    @C12580l
    private final List<String> matches;
    @C33608c("text")
    @C12579k
    private final List<String> text;

    public APIMSuggestion(@C12579k List<String> list, @C12579k List<String> list2, @C12580l List<String> list3, @C12580l APIMSuggestionFacetFilter aPIMSuggestionFacetFilter) {
        Intrinsics.checkNotNullParameter(list, "highlight");
        Intrinsics.checkNotNullParameter(list2, "text");
        this.highlight = list;
        this.text = list2;
        this.matches = list3;
        this.facetFilter = aPIMSuggestionFacetFilter;
    }

    public static /* synthetic */ APIMSuggestion copy$default(APIMSuggestion aPIMSuggestion, List<String> list, List<String> list2, List<String> list3, APIMSuggestionFacetFilter aPIMSuggestionFacetFilter, int i, Object obj) {
        if ((i & 1) != 0) {
            list = aPIMSuggestion.highlight;
        }
        if ((i & 2) != 0) {
            list2 = aPIMSuggestion.text;
        }
        if ((i & 4) != 0) {
            list3 = aPIMSuggestion.matches;
        }
        if ((i & 8) != 0) {
            aPIMSuggestionFacetFilter = aPIMSuggestion.facetFilter;
        }
        return aPIMSuggestion.copy(list, list2, list3, aPIMSuggestionFacetFilter);
    }

    @C12579k
    public final List<String> component1() {
        return this.highlight;
    }

    @C12579k
    public final List<String> component2() {
        return this.text;
    }

    @C12580l
    public final List<String> component3() {
        return this.matches;
    }

    @C12580l
    public final APIMSuggestionFacetFilter component4() {
        return this.facetFilter;
    }

    @C12579k
    public final APIMSuggestion copy(@C12579k List<String> list, @C12579k List<String> list2, @C12580l List<String> list3, @C12580l APIMSuggestionFacetFilter aPIMSuggestionFacetFilter) {
        Intrinsics.checkNotNullParameter(list, "highlight");
        Intrinsics.checkNotNullParameter(list2, "text");
        return new APIMSuggestion(list, list2, list3, aPIMSuggestionFacetFilter);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof APIMSuggestion)) {
            return false;
        }
        APIMSuggestion aPIMSuggestion = (APIMSuggestion) obj;
        return Intrinsics.areEqual((Object) this.highlight, (Object) aPIMSuggestion.highlight) && Intrinsics.areEqual((Object) this.text, (Object) aPIMSuggestion.text) && Intrinsics.areEqual((Object) this.matches, (Object) aPIMSuggestion.matches) && Intrinsics.areEqual((Object) this.facetFilter, (Object) aPIMSuggestion.facetFilter);
    }

    @C12580l
    public final APIMSuggestionFacetFilter getFacetFilter() {
        return this.facetFilter;
    }

    @C12579k
    public final List<String> getHighlight() {
        return this.highlight;
    }

    @C12580l
    public final List<String> getMatches() {
        return this.matches;
    }

    @C12579k
    public final List<String> getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = ((this.highlight.hashCode() * 31) + this.text.hashCode()) * 31;
        List<String> list = this.matches;
        int i = 0;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        APIMSuggestionFacetFilter aPIMSuggestionFacetFilter = this.facetFilter;
        if (aPIMSuggestionFacetFilter != null) {
            i = aPIMSuggestionFacetFilter.hashCode();
        }
        return hashCode2 + i;
    }

    @C12579k
    public String toString() {
        List<String> list = this.highlight;
        List<String> list2 = this.text;
        List<String> list3 = this.matches;
        APIMSuggestionFacetFilter aPIMSuggestionFacetFilter = this.facetFilter;
        return "APIMSuggestion(highlight=" + list + ", text=" + list2 + ", matches=" + list3 + ", facetFilter=" + aPIMSuggestionFacetFilter + ")";
    }
}
