package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001c"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/APIMFilteredSuggestion;", "", "highlight", "", "text", "matches", "", "facetFilter", "Lcom/carrefour/fid/android/data/entities/APIMSuggestionFacetFilter;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/carrefour/fid/android/data/entities/APIMSuggestionFacetFilter;)V", "getFacetFilter", "()Lcom/carrefour/fid/android/data/entities/APIMSuggestionFacetFilter;", "getHighlight", "()Ljava/lang/String;", "getMatches", "()Ljava/util/List;", "getText", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class APIMFilteredSuggestion {
    public static final int $stable = 8;
    @C33608c("facetFilter")
    @C12580l
    private final APIMSuggestionFacetFilter facetFilter;
    @C33608c("highlight")
    @C12579k
    private final String highlight;
    @C33608c("matches")
    @C12580l
    private final List<String> matches;
    @C33608c("text")
    @C12579k
    private final String text;

    public APIMFilteredSuggestion(@C12579k String str, @C12579k String str2, @C12580l List<String> list, @C12580l APIMSuggestionFacetFilter aPIMSuggestionFacetFilter) {
        Intrinsics.checkNotNullParameter(str, "highlight");
        Intrinsics.checkNotNullParameter(str2, "text");
        this.highlight = str;
        this.text = str2;
        this.matches = list;
        this.facetFilter = aPIMSuggestionFacetFilter;
    }

    public static /* synthetic */ APIMFilteredSuggestion copy$default(APIMFilteredSuggestion aPIMFilteredSuggestion, String str, String str2, List<String> list, APIMSuggestionFacetFilter aPIMSuggestionFacetFilter, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aPIMFilteredSuggestion.highlight;
        }
        if ((i & 2) != 0) {
            str2 = aPIMFilteredSuggestion.text;
        }
        if ((i & 4) != 0) {
            list = aPIMFilteredSuggestion.matches;
        }
        if ((i & 8) != 0) {
            aPIMSuggestionFacetFilter = aPIMFilteredSuggestion.facetFilter;
        }
        return aPIMFilteredSuggestion.copy(str, str2, list, aPIMSuggestionFacetFilter);
    }

    @C12579k
    public final String component1() {
        return this.highlight;
    }

    @C12579k
    public final String component2() {
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
    public final APIMFilteredSuggestion copy(@C12579k String str, @C12579k String str2, @C12580l List<String> list, @C12580l APIMSuggestionFacetFilter aPIMSuggestionFacetFilter) {
        Intrinsics.checkNotNullParameter(str, "highlight");
        Intrinsics.checkNotNullParameter(str2, "text");
        return new APIMFilteredSuggestion(str, str2, list, aPIMSuggestionFacetFilter);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof APIMFilteredSuggestion)) {
            return false;
        }
        APIMFilteredSuggestion aPIMFilteredSuggestion = (APIMFilteredSuggestion) obj;
        return Intrinsics.areEqual((Object) this.highlight, (Object) aPIMFilteredSuggestion.highlight) && Intrinsics.areEqual((Object) this.text, (Object) aPIMFilteredSuggestion.text) && Intrinsics.areEqual((Object) this.matches, (Object) aPIMFilteredSuggestion.matches) && Intrinsics.areEqual((Object) this.facetFilter, (Object) aPIMFilteredSuggestion.facetFilter);
    }

    @C12580l
    public final APIMSuggestionFacetFilter getFacetFilter() {
        return this.facetFilter;
    }

    @C12579k
    public final String getHighlight() {
        return this.highlight;
    }

    @C12580l
    public final List<String> getMatches() {
        return this.matches;
    }

    @C12579k
    public final String getText() {
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
        String str = this.highlight;
        String str2 = this.text;
        List<String> list = this.matches;
        APIMSuggestionFacetFilter aPIMSuggestionFacetFilter = this.facetFilter;
        return "APIMFilteredSuggestion(highlight=" + str + ", text=" + str2 + ", matches=" + list + ", facetFilter=" + aPIMSuggestionFacetFilter + ")";
    }
}
