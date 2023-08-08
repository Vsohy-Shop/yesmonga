package androidx.camera.view.video;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.view.video.C1837g;
import java.io.File;

/* renamed from: androidx.camera.view.video.b */
public final class C1828b extends C1837g {

    /* renamed from: b */
    public final File f5017b;

    /* renamed from: c */
    public final ParcelFileDescriptor f5018c;

    /* renamed from: d */
    public final ContentResolver f5019d;

    /* renamed from: e */
    public final Uri f5020e;

    /* renamed from: f */
    public final ContentValues f5021f;

    /* renamed from: g */
    public final C1833e f5022g;

    /* renamed from: androidx.camera.view.video.b$b */
    public static final class C1830b extends C1837g.C1838a {

        /* renamed from: a */
        public File f5023a;

        /* renamed from: b */
        public ParcelFileDescriptor f5024b;

        /* renamed from: c */
        public ContentResolver f5025c;

        /* renamed from: d */
        public Uri f5026d;

        /* renamed from: e */
        public ContentValues f5027e;

        /* renamed from: f */
        public C1833e f5028f;

        /* renamed from: a */
        public C1837g mo6016a() {
            String str = "";
            if (this.f5028f == null) {
                str = str + " metadata";
            }
            if (str.isEmpty()) {
                return new C1828b(this.f5023a, this.f5024b, this.f5025c, this.f5026d, this.f5027e, this.f5028f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C1837g.C1838a mo6017b(@C0363p0 ContentResolver contentResolver) {
            this.f5025c = contentResolver;
            return this;
        }

        /* renamed from: c */
        public C1837g.C1838a mo6018c(@C0363p0 ContentValues contentValues) {
            this.f5027e = contentValues;
            return this;
        }

        /* renamed from: d */
        public C1837g.C1838a mo6019d(@C0363p0 File file) {
            this.f5023a = file;
            return this;
        }

        /* renamed from: e */
        public C1837g.C1838a mo6020e(@C0363p0 ParcelFileDescriptor parcelFileDescriptor) {
            this.f5024b = parcelFileDescriptor;
            return this;
        }

        /* renamed from: f */
        public C1837g.C1838a mo6021f(C1833e eVar) {
            if (eVar != null) {
                this.f5028f = eVar;
                return this;
            }
            throw new NullPointerException("Null metadata");
        }

        /* renamed from: g */
        public C1837g.C1838a mo6022g(@C0363p0 Uri uri) {
            this.f5026d = uri;
            return this;
        }
    }

    @C0363p0
    /* renamed from: d */
    public ContentResolver mo6007d() {
        return this.f5019d;
    }

    @C0363p0
    /* renamed from: e */
    public ContentValues mo6008e() {
        return this.f5021f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1837g)) {
            return false;
        }
        C1837g gVar = (C1837g) obj;
        File file = this.f5017b;
        if (file != null ? file.equals(gVar.mo6010f()) : gVar.mo6010f() == null) {
            ParcelFileDescriptor parcelFileDescriptor = this.f5018c;
            if (parcelFileDescriptor != null ? parcelFileDescriptor.equals(gVar.mo6011g()) : gVar.mo6011g() == null) {
                ContentResolver contentResolver = this.f5019d;
                if (contentResolver != null ? contentResolver.equals(gVar.mo6007d()) : gVar.mo6007d() == null) {
                    Uri uri = this.f5020e;
                    if (uri != null ? uri.equals(gVar.mo6014i()) : gVar.mo6014i() == null) {
                        ContentValues contentValues = this.f5021f;
                        if (contentValues != null ? contentValues.equals(gVar.mo6008e()) : gVar.mo6008e() == null) {
                            if (this.f5022g.equals(gVar.mo6012h())) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @C0363p0
    /* renamed from: f */
    public File mo6010f() {
        return this.f5017b;
    }

    @C0363p0
    /* renamed from: g */
    public ParcelFileDescriptor mo6011g() {
        return this.f5018c;
    }

    @C0359n0
    /* renamed from: h */
    public C1833e mo6012h() {
        return this.f5022g;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        File file = this.f5017b;
        int i5 = 0;
        if (file == null) {
            i = 0;
        } else {
            i = file.hashCode();
        }
        int i6 = (i ^ 1000003) * 1000003;
        ParcelFileDescriptor parcelFileDescriptor = this.f5018c;
        if (parcelFileDescriptor == null) {
            i2 = 0;
        } else {
            i2 = parcelFileDescriptor.hashCode();
        }
        int i7 = (i6 ^ i2) * 1000003;
        ContentResolver contentResolver = this.f5019d;
        if (contentResolver == null) {
            i3 = 0;
        } else {
            i3 = contentResolver.hashCode();
        }
        int i8 = (i7 ^ i3) * 1000003;
        Uri uri = this.f5020e;
        if (uri == null) {
            i4 = 0;
        } else {
            i4 = uri.hashCode();
        }
        int i9 = (i8 ^ i4) * 1000003;
        ContentValues contentValues = this.f5021f;
        if (contentValues != null) {
            i5 = contentValues.hashCode();
        }
        return ((i9 ^ i5) * 1000003) ^ this.f5022g.hashCode();
    }

    @C0363p0
    /* renamed from: i */
    public Uri mo6014i() {
        return this.f5020e;
    }

    public String toString() {
        return "OutputFileOptions{file=" + this.f5017b + ", fileDescriptor=" + this.f5018c + ", contentResolver=" + this.f5019d + ", saveCollection=" + this.f5020e + ", contentValues=" + this.f5021f + ", metadata=" + this.f5022g + "}";
    }

    public C1828b(@C0363p0 File file, @C0363p0 ParcelFileDescriptor parcelFileDescriptor, @C0363p0 ContentResolver contentResolver, @C0363p0 Uri uri, @C0363p0 ContentValues contentValues, C1833e eVar) {
        this.f5017b = file;
        this.f5018c = parcelFileDescriptor;
        this.f5019d = contentResolver;
        this.f5020e = uri;
        this.f5021f = contentValues;
        this.f5022g = eVar;
    }
}
