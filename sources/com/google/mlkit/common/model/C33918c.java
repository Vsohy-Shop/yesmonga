package com.google.mlkit.common.model;

import android.net.Uri;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40808s;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.internal.mlkit_common.C42511s9;
import com.google.android.gms.internal.mlkit_common.C42522t9;

/* renamed from: com.google.mlkit.common.model.c */
public class C33918c {
    @C0363p0

    /* renamed from: a */
    public final String f82308a;
    @C0363p0

    /* renamed from: b */
    public final String f82309b;
    @C0363p0

    /* renamed from: c */
    public final Uri f82310c;

    /* renamed from: d */
    public final boolean f82311d;

    /* renamed from: com.google.mlkit.common.model.c$a */
    public static class C33919a {
        @C0363p0

        /* renamed from: a */
        public String f82312a = null;
        @C0363p0

        /* renamed from: b */
        public String f82313b = null;
        @C0363p0

        /* renamed from: c */
        public Uri f82314c = null;

        /* renamed from: d */
        public boolean f82315d = false;

        @C0359n0
        /* renamed from: a */
        public C33918c mo98671a() {
            String str = this.f82312a;
            boolean z = true;
            if (!((str != null && this.f82313b == null && this.f82314c == null) || ((str == null && this.f82313b != null && this.f82314c == null) || (str == null && this.f82313b == null && this.f82314c != null)))) {
                z = false;
            }
            C40843u.m166192b(z, "Set one of filePath, assetFilePath and URI.");
            return new C33918c(this.f82312a, this.f82313b, this.f82314c, this.f82315d, (C33926i) null);
        }

        @C0359n0
        /* renamed from: b */
        public C33919a mo98672b(@RecentlyNonNull String str) {
            C40843u.m166199i(str, "Model Source file path can not be empty");
            boolean z = false;
            if (this.f82313b == null && this.f82314c == null && !this.f82315d) {
                z = true;
            }
            C40843u.m166192b(z, "A local model source is from absolute file path, asset file path or URI, you can only set one of them.");
            this.f82312a = str;
            return this;
        }

        @C0359n0
        /* renamed from: c */
        public C33919a mo98673c(@RecentlyNonNull String str) {
            C40843u.m166199i(str, "Manifest file path can not be empty");
            boolean z = false;
            if (this.f82313b == null && this.f82314c == null && (this.f82312a == null || this.f82315d)) {
                z = true;
            }
            C40843u.m166192b(z, "A local model source is from absolute file path, asset file path or URI, you can only set one of them.");
            this.f82312a = str;
            this.f82315d = true;
            return this;
        }

        @C0359n0
        /* renamed from: d */
        public C33919a mo98674d(@RecentlyNonNull String str) {
            C40843u.m166199i(str, "Model Source file path can not be empty");
            boolean z = false;
            if (this.f82312a == null && this.f82314c == null && !this.f82315d) {
                z = true;
            }
            C40843u.m166192b(z, "A local model source is from absolute file path, asset file path or URI, you can only set one of them.");
            this.f82313b = str;
            return this;
        }

        @C0359n0
        /* renamed from: e */
        public C33919a mo98675e(@RecentlyNonNull String str) {
            C40843u.m166199i(str, "Manifest file path can not be empty");
            boolean z = false;
            if (this.f82312a == null && this.f82314c == null && (this.f82313b == null || this.f82315d)) {
                z = true;
            }
            C40843u.m166192b(z, "A local model source is from absolute file path, asset file path or URI, you can only set one of them.");
            this.f82313b = str;
            this.f82315d = true;
            return this;
        }

        @C0359n0
        /* renamed from: f */
        public C33919a mo98676f(@RecentlyNonNull Uri uri) {
            boolean z = false;
            if (this.f82312a == null && this.f82313b == null) {
                z = true;
            }
            C40843u.m166192b(z, "A local model source is from absolute file path, asset file path or URI, you can only set one of them.");
            this.f82314c = uri;
            return this;
        }
    }

    public /* synthetic */ C33918c(String str, String str2, Uri uri, boolean z, C33926i iVar) {
        this.f82308a = str;
        this.f82309b = str2;
        this.f82310c = uri;
        this.f82311d = z;
    }

    @C40473a
    @RecentlyNullable
    /* renamed from: a */
    public String mo98664a() {
        return this.f82308a;
    }

    @C40473a
    @RecentlyNullable
    /* renamed from: b */
    public String mo98665b() {
        return this.f82309b;
    }

    @C40473a
    @RecentlyNullable
    /* renamed from: c */
    public Uri mo98666c() {
        return this.f82310c;
    }

    @C40473a
    /* renamed from: d */
    public boolean mo98667d() {
        return this.f82311d;
    }

    public boolean equals(@C0363p0 Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C33918c)) {
            return false;
        }
        C33918c cVar = (C33918c) obj;
        if (!C40808s.m166010b(this.f82308a, cVar.f82308a) || !C40808s.m166010b(this.f82309b, cVar.f82309b) || !C40808s.m166010b(this.f82310c, cVar.f82310c) || this.f82311d != cVar.f82311d) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C40808s.m166011c(this.f82308a, this.f82309b, this.f82310c, Boolean.valueOf(this.f82311d));
    }

    @RecentlyNonNull
    public String toString() {
        C42511s9 a = C42522t9.m171674a(this);
        a.mo137795a("absoluteFilePath", this.f82308a);
        a.mo137795a("assetFilePath", this.f82309b);
        a.mo137795a("uri", this.f82310c);
        a.mo137796b("isManifestFile", this.f82311d);
        return a.toString();
    }
}
