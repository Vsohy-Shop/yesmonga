package com.urbanairship.iam.assets;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.storage.StorageManager;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.C36044d;
import com.urbanairship.C36059m;
import com.urbanairship.UAirship;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.C9669o0;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

public class Assets implements Parcelable {
    @C0359n0
    public static final Parcelable.Creator<Assets> CREATOR = new C9130a();

    /* renamed from: g */
    public static final String f24728g = "metadata";

    /* renamed from: v */
    public static final String f24729v = "files";

    /* renamed from: a */
    public final Executor f24730a;

    /* renamed from: b */
    public final File f24731b;

    /* renamed from: c */
    public final File f24732c;

    /* renamed from: d */
    public final File f24733d;

    /* renamed from: e */
    public final Map<String, JsonValue> f24734e;

    /* renamed from: f */
    public final Object f24735f;

    /* renamed from: com.urbanairship.iam.assets.Assets$a */
    public class C9130a implements Parcelable.Creator<Assets> {
        @C0359n0
        /* renamed from: a */
        public Assets createFromParcel(@C0359n0 Parcel parcel) {
            C9323b bVar;
            try {
                bVar = JsonValue.m34960C(parcel.readString()).mo18749A();
            } catch (JsonException e) {
                C36059m.m148411g(e, "Failed to parse metadata", new Object[0]);
                bVar = C9323b.f25440b;
            }
            return new Assets(new File(parcel.readString()), bVar, (C9130a) null);
        }

        @C0359n0
        /* renamed from: b */
        public Assets[] newArray(int i) {
            return new Assets[i];
        }
    }

    /* renamed from: com.urbanairship.iam.assets.Assets$b */
    public class C9131b implements Runnable {
        public C9131b() {
        }

        public void run() {
            Assets assets = Assets.this;
            assets.mo18233k(assets.f24733d, JsonValue.m34975U(Assets.this.f24734e));
        }
    }

    public /* synthetic */ Assets(File file, C9323b bVar, C9130a aVar) {
        this(file, bVar);
    }

    /* renamed from: d */
    public static void m34157d(@C0363p0 Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                C36059m.m148410f(e);
            }
        }
    }

    @C0348i1
    @C0359n0
    /* renamed from: g */
    public static Assets m34158g(@C0359n0 File file) {
        return new Assets(file, m34159i(new File(file, "metadata")).mo18749A());
    }

    /* renamed from: i */
    public static JsonValue m34159i(File file) {
        if (!file.exists()) {
            return JsonValue.f25436b;
        }
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            try {
                StringWriter stringWriter = new StringWriter();
                char[] cArr = new char[1024];
                while (true) {
                    int read = bufferedReader2.read(cArr);
                    if (read != -1) {
                        stringWriter.write(cArr, 0, read);
                    } else {
                        JsonValue C = JsonValue.m34960C(stringWriter.toString());
                        m34157d(bufferedReader2);
                        return C;
                    }
                }
            } catch (IOException e) {
                e = e;
                bufferedReader = bufferedReader2;
                C36059m.m148411g(e, "Error reading file", new Object[0]);
                m34157d(bufferedReader);
                return JsonValue.f25436b;
            } catch (JsonException e2) {
                e = e2;
                bufferedReader = bufferedReader2;
                C36059m.m148411g(e, "Error parsing file as JSON.", new Object[0]);
                m34157d(bufferedReader);
                return JsonValue.f25436b;
            } catch (Throwable th) {
                th = th;
                bufferedReader = bufferedReader2;
                m34157d(bufferedReader);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            C36059m.m148411g(e, "Error reading file", new Object[0]);
            m34157d(bufferedReader);
            return JsonValue.f25436b;
        } catch (JsonException e4) {
            e = e4;
            C36059m.m148411g(e, "Error parsing file as JSON.", new Object[0]);
            m34157d(bufferedReader);
            return JsonValue.f25436b;
        } catch (Throwable th2) {
            th = th2;
            m34157d(bufferedReader);
            throw th;
        }
    }

    public int describeContents() {
        return 0;
    }

    @C0359n0
    /* renamed from: e */
    public File mo18229e(@C0359n0 String str) {
        mo18231h();
        return new File(this.f24732c, C9669o0.m36229j(str));
    }

    @C0359n0
    /* renamed from: f */
    public JsonValue mo18230f(@C0359n0 String str) {
        JsonValue jsonValue;
        synchronized (this.f24735f) {
            jsonValue = this.f24734e.get(str);
            if (jsonValue == null) {
                jsonValue = JsonValue.f25436b;
            }
        }
        return jsonValue;
    }

    /* renamed from: h */
    public final void mo18231h() {
        if (!this.f24731b.exists()) {
            if (!this.f24731b.mkdirs()) {
                C36059m.m148409e("Failed to create assets directory.", new Object[0]);
            } else if (Build.VERSION.SDK_INT >= 26) {
                try {
                    ((StorageManager) UAirship.m146200l().getSystemService("storage")).setCacheBehaviorGroup(this.f24731b, true);
                } catch (IOException e) {
                    C36059m.m148411g(e, "Failed to set cache behavior on directory: %s", this.f24731b.getAbsoluteFile());
                }
            }
        }
        if (!this.f24732c.exists() && !this.f24732c.mkdirs()) {
            C36059m.m148409e("Failed to create directory: %s", this.f24732c.getAbsoluteFile());
        }
    }

    /* renamed from: j */
    public void mo18232j(@C0359n0 String str, @C0359n0 C9333e eVar) {
        synchronized (this.f24735f) {
            this.f24734e.put(str, eVar.mo17264q());
            this.f24730a.execute(new C9131b());
        }
    }

    @C0348i1
    /* renamed from: k */
    public final void mo18233k(@C0359n0 File file, @C0359n0 JsonValue jsonValue) {
        mo18231h();
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(jsonValue.toString().getBytes());
                fileOutputStream2.close();
                m34157d(fileOutputStream2);
            } catch (Exception e) {
                e = e;
                fileOutputStream = fileOutputStream2;
                try {
                    C36059m.m148411g(e, "Failed to write metadata.", new Object[0]);
                    m34157d(fileOutputStream);
                } catch (Throwable th) {
                    th = th;
                    m34157d(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                m34157d(fileOutputStream);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            C36059m.m148411g(e, "Failed to write metadata.", new Object[0]);
            m34157d(fileOutputStream);
        }
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        synchronized (this.f24735f) {
            parcel.writeString(JsonValue.m34975U(this.f24734e).toString());
        }
        parcel.writeString(this.f24731b.getAbsolutePath());
    }

    public Assets(@C0359n0 File file, @C0359n0 C9323b bVar) {
        this.f24735f = new Object();
        this.f24731b = file;
        this.f24732c = new File(file, f24729v);
        this.f24733d = new File(file, "metadata");
        this.f24734e = new HashMap(bVar.mo18813r());
        this.f24730a = C36044d.m148369a();
    }
}
