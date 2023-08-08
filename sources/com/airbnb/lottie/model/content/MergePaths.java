package com.airbnb.lottie.model.content;

import androidx.annotation.C0363p0;
import com.airbnb.lottie.C21516j;
import com.airbnb.lottie.animation.content.C21445c;
import com.airbnb.lottie.animation.content.C21454l;
import com.airbnb.lottie.model.layer.C21578a;
import com.airbnb.lottie.utils.C21682f;
import kotlinx.serialization.json.internal.C12361b;

public class MergePaths implements C21562b {

    /* renamed from: a */
    public final String f55634a;

    /* renamed from: b */
    public final MergePathsMode f55635b;

    /* renamed from: c */
    public final boolean f55636c;

    public enum MergePathsMode {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        /* renamed from: b */
        public static MergePathsMode m99312b(int i) {
            if (i == 1) {
                return MERGE;
            }
            if (i == 2) {
                return ADD;
            }
            if (i == 3) {
                return SUBTRACT;
            }
            if (i == 4) {
                return INTERSECT;
            }
            if (i != 5) {
                return MERGE;
            }
            return EXCLUDE_INTERSECTIONS;
        }
    }

    public MergePaths(String str, MergePathsMode mergePathsMode, boolean z) {
        this.f55634a = str;
        this.f55635b = mergePathsMode;
        this.f55636c = z;
    }

    @C0363p0
    /* renamed from: a */
    public C21445c mo64305a(C21516j jVar, C21578a aVar) {
        if (jVar.mo64260w()) {
            return new C21454l(this);
        }
        C21682f.m99760e("Animation contains merge paths but they are disabled.");
        return null;
    }

    /* renamed from: b */
    public MergePathsMode mo64331b() {
        return this.f55635b;
    }

    /* renamed from: c */
    public String mo64332c() {
        return this.f55634a;
    }

    /* renamed from: d */
    public boolean mo64333d() {
        return this.f55636c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f55635b + C12361b.f30259j;
    }
}
