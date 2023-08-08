package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B5\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003JA\u0010\u0015\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\bHÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\t\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001c"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/APIMSuggestionList;", "", "filteredSuggestions", "", "Lcom/carrefour/fid/android/data/entities/APIMFilteredSuggestion;", "suggestions", "Lcom/carrefour/fid/android/data/entities/APIMSuggestion;", "engineTimeInMilis", "", "totalHits", "(Ljava/util/List;Ljava/util/List;II)V", "getEngineTimeInMilis", "()I", "getFilteredSuggestions", "()Ljava/util/List;", "getSuggestions", "getTotalHits", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class APIMSuggestionList {
    public static final int $stable = 8;
    @C33608c("engineTimeInMilis")
    private final int engineTimeInMilis;
    @C33608c("filteredsuggestions")
    @C12580l
    private final List<APIMFilteredSuggestion> filteredSuggestions;
    @C33608c("suggestions")
    @C12580l
    private final List<APIMSuggestion> suggestions;
    @C33608c("totalHits")
    private final int totalHits;

    public APIMSuggestionList(@C12580l List<APIMFilteredSuggestion> list, @C12580l List<APIMSuggestion> list2, int i, int i2) {
        this.filteredSuggestions = list;
        this.suggestions = list2;
        this.engineTimeInMilis = i;
        this.totalHits = i2;
    }

    public static /* synthetic */ APIMSuggestionList copy$default(APIMSuggestionList aPIMSuggestionList, List<APIMFilteredSuggestion> list, List<APIMSuggestion> list2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = aPIMSuggestionList.filteredSuggestions;
        }
        if ((i3 & 2) != 0) {
            list2 = aPIMSuggestionList.suggestions;
        }
        if ((i3 & 4) != 0) {
            i = aPIMSuggestionList.engineTimeInMilis;
        }
        if ((i3 & 8) != 0) {
            i2 = aPIMSuggestionList.totalHits;
        }
        return aPIMSuggestionList.copy(list, list2, i, i2);
    }

    @C12580l
    public final List<APIMFilteredSuggestion> component1() {
        return this.filteredSuggestions;
    }

    @C12580l
    public final List<APIMSuggestion> component2() {
        return this.suggestions;
    }

    public final int component3() {
        return this.engineTimeInMilis;
    }

    public final int component4() {
        return this.totalHits;
    }

    @C12579k
    public final APIMSuggestionList copy(@C12580l List<APIMFilteredSuggestion> list, @C12580l List<APIMSuggestion> list2, int i, int i2) {
        return new APIMSuggestionList(list, list2, i, i2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof APIMSuggestionList)) {
            return false;
        }
        APIMSuggestionList aPIMSuggestionList = (APIMSuggestionList) obj;
        return Intrinsics.areEqual((Object) this.filteredSuggestions, (Object) aPIMSuggestionList.filteredSuggestions) && Intrinsics.areEqual((Object) this.suggestions, (Object) aPIMSuggestionList.suggestions) && this.engineTimeInMilis == aPIMSuggestionList.engineTimeInMilis && this.totalHits == aPIMSuggestionList.totalHits;
    }

    public final int getEngineTimeInMilis() {
        return this.engineTimeInMilis;
    }

    @C12580l
    public final List<APIMFilteredSuggestion> getFilteredSuggestions() {
        return this.filteredSuggestions;
    }

    @C12580l
    public final List<APIMSuggestion> getSuggestions() {
        return this.suggestions;
    }

    public final int getTotalHits() {
        return this.totalHits;
    }

    public int hashCode() {
        List<APIMFilteredSuggestion> list = this.filteredSuggestions;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<APIMSuggestion> list2 = this.suggestions;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return ((((hashCode + i) * 31) + Integer.hashCode(this.engineTimeInMilis)) * 31) + Integer.hashCode(this.totalHits);
    }

    @C12579k
    public String toString() {
        List<APIMFilteredSuggestion> list = this.filteredSuggestions;
        List<APIMSuggestion> list2 = this.suggestions;
        int i = this.engineTimeInMilis;
        int i2 = this.totalHits;
        return "APIMSuggestionList(filteredSuggestions=" + list + ", suggestions=" + list2 + ", engineTimeInMilis=" + i + ", totalHits=" + i2 + ")";
    }
}
