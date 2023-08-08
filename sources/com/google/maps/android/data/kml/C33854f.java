package com.google.maps.android.data.kml;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.annotation.C0374u0;
import com.google.android.gms.maps.C30412c;
import com.google.maps.android.collections.C33791b;
import com.google.maps.android.collections.C33796d;
import com.google.maps.android.collections.C33798e;
import com.google.maps.android.collections.C33800f;
import com.google.maps.android.data.C33820d;
import com.google.maps.android.data.C33845k;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: com.google.maps.android.data.kml.f */
public class C33854f extends C33820d {
    public C33854f(C30412c cVar, int i, Context context) throws XmlPullParserException, IOException {
        this(cVar, context.getResources().openRawResource(i), context, new C33796d(cVar), new C33798e(cVar), new C33800f(cVar), new C33791b(cVar), (C33845k.C33847b) null);
    }

    /* renamed from: v */
    public static XmlPullParser m136270v(InputStream inputStream) throws XmlPullParserException {
        XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
        newInstance.setNamespaceAware(true);
        XmlPullParser newPullParser = newInstance.newPullParser();
        newPullParser.setInput(inputStream, (String) null);
        return newPullParser;
    }

    /* renamed from: y */
    public static C33858j m136271y(InputStream inputStream) throws XmlPullParserException, IOException {
        C33858j jVar = new C33858j(m136270v(inputStream));
        jVar.mo98477f();
        return jVar;
    }

    /* renamed from: d */
    public void mo98238d() {
        super.mo98237c();
    }

    /* renamed from: f */
    public Iterable<C33849b> mo98240f() {
        return super.mo98240f();
    }

    /* renamed from: l */
    public Iterable<C33853e> mo98246l() {
        return super.mo98246l();
    }

    /* renamed from: n */
    public boolean mo98248n() {
        return super.mo98248n();
    }

    /* renamed from: w */
    public Iterable<C33859k> mo98467w() {
        return mo98245k();
    }

    /* renamed from: x */
    public boolean mo98468x() {
        return mo98249o();
    }

    public C33854f(C30412c cVar, InputStream inputStream, Context context) throws XmlPullParserException, IOException {
        this(cVar, inputStream, context, new C33796d(cVar), new C33798e(cVar), new C33800f(cVar), new C33791b(cVar), (C33845k.C33847b) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C33854f(C30412c cVar, @C0374u0 int i, Context context, C33796d dVar, C33798e eVar, C33800f fVar, C33791b bVar, C33845k.C33847b bVar2) throws XmlPullParserException, IOException {
        this(cVar, context.getResources().openRawResource(i), context, dVar, eVar, fVar, bVar, bVar2);
        int i2 = i;
    }

    public C33854f(C30412c cVar, InputStream inputStream, Context context, C33796d dVar, C33798e eVar, C33800f fVar, C33791b bVar, C33845k.C33847b bVar2) throws XmlPullParserException, IOException {
        if (inputStream != null) {
            C33862n nVar = new C33862n(cVar, context, dVar, eVar, fVar, bVar, bVar2);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            bufferedInputStream.mark(1024);
            ZipInputStream zipInputStream = new ZipInputStream(bufferedInputStream);
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry != null) {
                    HashMap hashMap = new HashMap();
                    C33858j jVar = null;
                    while (nextEntry != null) {
                        if (jVar != null || !nextEntry.getName().toLowerCase().endsWith(".kml")) {
                            Bitmap decodeStream = BitmapFactory.decodeStream(zipInputStream);
                            if (decodeStream != null) {
                                hashMap.put(nextEntry.getName(), decodeStream);
                            } else {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Unsupported KMZ contents file type: ");
                                sb.append(nextEntry.getName());
                            }
                        } else {
                            jVar = m136271y(zipInputStream);
                        }
                        nextEntry = zipInputStream.getNextEntry();
                    }
                    if (jVar != null) {
                        nVar.mo98514f1(jVar.mo98476e(), jVar.mo98475d(), jVar.mo98474c(), jVar.mo98472a(), jVar.mo98473b(), hashMap);
                    } else {
                        throw new IllegalArgumentException("KML not found in InputStream");
                    }
                } else {
                    bufferedInputStream.reset();
                    C33858j y = m136271y(bufferedInputStream);
                    nVar.mo98513e1(y.mo98476e(), y.mo98475d(), y.mo98474c(), y.mo98472a(), y.mo98473b());
                }
                try {
                    mo98255u(nVar);
                    inputStream.close();
                    bufferedInputStream.close();
                    zipInputStream.close();
                } catch (Throwable th) {
                    th = th;
                    inputStream.close();
                    bufferedInputStream.close();
                    zipInputStream.close();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream.close();
                bufferedInputStream.close();
                zipInputStream.close();
                throw th;
            }
        } else {
            throw new IllegalArgumentException("KML InputStream cannot be null");
        }
    }
}
