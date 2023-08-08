package com.airbnb.lottie.parser;

/* renamed from: com.airbnb.lottie.parser.v */
public class C21651v {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        if (r0.equals(com.journeyapps.barcodescanner.camera.C34935s.f84988a) == false) goto L_0x0062;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.airbnb.lottie.model.content.Mask m99712a(com.airbnb.lottie.parser.moshi.JsonReader r11, com.airbnb.lottie.C21495g r12) throws java.io.IOException {
        /*
            r11.mo64552c()
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = r2
            r4 = r1
        L_0x0008:
            boolean r5 = r11.mo64555g()
            if (r5 == 0) goto L_0x00d4
            java.lang.String r5 = r11.mo64560l()
            r5.hashCode()
            int r6 = r5.hashCode()
            r7 = 3
            r8 = 2
            r9 = 1
            r10 = -1
            switch(r6) {
                case 111: goto L_0x0043;
                case 3588: goto L_0x0038;
                case 104433: goto L_0x002d;
                case 3357091: goto L_0x0022;
                default: goto L_0x0020;
            }
        L_0x0020:
            r6 = r10
            goto L_0x004d
        L_0x0022:
            java.lang.String r6 = "mode"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x002b
            goto L_0x0020
        L_0x002b:
            r6 = r7
            goto L_0x004d
        L_0x002d:
            java.lang.String r6 = "inv"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x0036
            goto L_0x0020
        L_0x0036:
            r6 = r8
            goto L_0x004d
        L_0x0038:
            java.lang.String r6 = "pt"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x0041
            goto L_0x0020
        L_0x0041:
            r6 = r9
            goto L_0x004d
        L_0x0043:
            java.lang.String r6 = "o"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x004c
            goto L_0x0020
        L_0x004c:
            r6 = r1
        L_0x004d:
            switch(r6) {
                case 0: goto L_0x00ce;
                case 1: goto L_0x00c8;
                case 2: goto L_0x00c2;
                case 3: goto L_0x0054;
                default: goto L_0x0050;
            }
        L_0x0050:
            r11.mo64566s()
            goto L_0x0008
        L_0x0054:
            java.lang.String r0 = r11.mo64561m()
            r0.hashCode()
            int r6 = r0.hashCode()
            switch(r6) {
                case 97: goto L_0x0083;
                case 105: goto L_0x0078;
                case 110: goto L_0x006d;
                case 115: goto L_0x0064;
                default: goto L_0x0062;
            }
        L_0x0062:
            r7 = r10
            goto L_0x008d
        L_0x0064:
            java.lang.String r6 = "s"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x008d
            goto L_0x0062
        L_0x006d:
            java.lang.String r6 = "n"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0076
            goto L_0x0062
        L_0x0076:
            r7 = r8
            goto L_0x008d
        L_0x0078:
            java.lang.String r6 = "i"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0081
            goto L_0x0062
        L_0x0081:
            r7 = r9
            goto L_0x008d
        L_0x0083:
            java.lang.String r6 = "a"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x008c
            goto L_0x0062
        L_0x008c:
            r7 = r1
        L_0x008d:
            switch(r7) {
                case 0: goto L_0x00be;
                case 1: goto L_0x00b5;
                case 2: goto L_0x00b1;
                case 3: goto L_0x00ad;
                default: goto L_0x0090;
            }
        L_0x0090:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Unknown mask mode "
            r0.append(r6)
            r0.append(r5)
            java.lang.String r5 = ". Defaulting to Add."
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.airbnb.lottie.utils.C21682f.m99760e(r0)
            com.airbnb.lottie.model.content.Mask$MaskMode r0 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_ADD
            goto L_0x0008
        L_0x00ad:
            com.airbnb.lottie.model.content.Mask$MaskMode r0 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_SUBTRACT
            goto L_0x0008
        L_0x00b1:
            com.airbnb.lottie.model.content.Mask$MaskMode r0 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_NONE
            goto L_0x0008
        L_0x00b5:
            java.lang.String r0 = "Animation contains intersect masks. They are not supported but will be treated like add masks."
            r12.mo64118a(r0)
            com.airbnb.lottie.model.content.Mask$MaskMode r0 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_INTERSECT
            goto L_0x0008
        L_0x00be:
            com.airbnb.lottie.model.content.Mask$MaskMode r0 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_ADD
            goto L_0x0008
        L_0x00c2:
            boolean r4 = r11.mo64557i()
            goto L_0x0008
        L_0x00c8:
            com.airbnb.lottie.model.animatable.h r2 = com.airbnb.lottie.parser.C21609d.m99583k(r11, r12)
            goto L_0x0008
        L_0x00ce:
            com.airbnb.lottie.model.animatable.d r3 = com.airbnb.lottie.parser.C21609d.m99580h(r11, r12)
            goto L_0x0008
        L_0x00d4:
            r11.mo64554f()
            com.airbnb.lottie.model.content.Mask r11 = new com.airbnb.lottie.model.content.Mask
            r11.<init>(r0, r2, r3, r4)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.C21651v.m99712a(com.airbnb.lottie.parser.moshi.JsonReader, com.airbnb.lottie.g):com.airbnb.lottie.model.content.Mask");
    }
}
