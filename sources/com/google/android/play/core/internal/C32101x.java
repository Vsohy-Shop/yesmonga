package com.google.android.play.core.internal;

import android.content.res.AssetManager;
import android.support.annotation.Nullable;
import com.google.android.play.core.splitcompat.C32135c;
import java.io.File;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.google.android.play.core.internal.x */
public final class C32101x {

    /* renamed from: a */
    public final C32135c f78314a;
    @Nullable

    /* renamed from: b */
    public XmlPullParser f78315b;

    public C32101x(C32135c cVar) {
        this.f78314a = cVar;
    }

    /* renamed from: a */
    public final void mo92841a(AssetManager assetManager, File file) throws IOException {
        this.f78315b = assetManager.openXmlResourceParser(C32135c.m130062c(assetManager, file), "AndroidManifest.xml");
    }

    /* renamed from: b */
    public final long mo92842b() throws IOException, XmlPullParserException {
        if (this.f78315b != null) {
            while (true) {
                int next = this.f78315b.next();
                if (next != 2) {
                    if (next == 1) {
                        break;
                    }
                } else if (this.f78315b.getName().equals("manifest")) {
                    String attributeValue = this.f78315b.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCode");
                    String attributeValue2 = this.f78315b.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCodeMajor");
                    if (attributeValue != null) {
                        try {
                            int parseInt = Integer.parseInt(attributeValue);
                            if (attributeValue2 == null) {
                                return (long) parseInt;
                            }
                            try {
                                return (((long) Integer.parseInt(attributeValue2)) << 32) | (((long) parseInt) & 4294967295L);
                            } catch (NumberFormatException e) {
                                throw new XmlPullParserException(String.format("Couldn't parse versionCodeMajor to int: %s", new Object[]{e.getMessage()}));
                            }
                        } catch (NumberFormatException e2) {
                            throw new XmlPullParserException(String.format("Couldn't parse versionCode to int: %s", new Object[]{e2.getMessage()}));
                        }
                    } else {
                        throw new XmlPullParserException("Manifest entry doesn't contain 'versionCode' attribute.");
                    }
                }
            }
            throw new XmlPullParserException("Couldn't find manifest entry at top-level.");
        }
        throw new XmlPullParserException("Manifest file needs to be loaded before parsing.");
    }
}
