package com.google.android.gms.internal.mlkit_vision_common;

import androidx.compose.runtime.ComposerKt;
import androidx.core.location.C17699g;
import androidx.media.AudioAttributesCompat;
import com.contentsquare.android.api.C14092c;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;

public enum zzfs implements C39117a8 {
    UNKNOWN_EVENT(0),
    ON_DEVICE_FACE_DETECT(1),
    ON_DEVICE_FACE_CREATE(2),
    ON_DEVICE_FACE_CLOSE(3),
    ON_DEVICE_FACE_LOAD(4),
    ON_DEVICE_TEXT_DETECT(11),
    ON_DEVICE_TEXT_CREATE(12),
    ON_DEVICE_TEXT_CLOSE(13),
    ON_DEVICE_BARCODE_DETECT(21),
    ON_DEVICE_BARCODE_CREATE(22),
    ON_DEVICE_BARCODE_CLOSE(23),
    ON_DEVICE_BARCODE_LOAD(24),
    ON_DEVICE_IMAGE_LABEL_DETECT(141),
    ON_DEVICE_IMAGE_LABEL_CREATE(142),
    ON_DEVICE_IMAGE_LABEL_CLOSE(143),
    ON_DEVICE_IMAGE_LABEL_LOAD(C14092c.f34532K1),
    ON_DEVICE_SMART_REPLY_DETECT(151),
    ON_DEVICE_SMART_REPLY_CREATE(C14092c.f34530K),
    ON_DEVICE_SMART_REPLY_CLOSE(153),
    ON_DEVICE_SMART_REPLY_BLACKLIST_UPDATE(154),
    ON_DEVICE_LANGUAGE_IDENTIFICATION_DETECT(161),
    ON_DEVICE_LANGUAGE_IDENTIFICATION_CREATE(162),
    ON_DEVICE_LANGUAGE_IDENTIFICATION_LOAD(164),
    ON_DEVICE_LANGUAGE_IDENTIFICATION_CLOSE(163),
    ON_DEVICE_TRANSLATOR_TRANSLATE(171),
    ON_DEVICE_TRANSLATOR_CREATE(172),
    ON_DEVICE_TRANSLATOR_LOAD(173),
    ON_DEVICE_TRANSLATOR_CLOSE(C14092c.f34545P),
    ON_DEVICE_TRANSLATOR_DOWNLOAD(HideBottomViewOnScrollBehavior.f74656f),
    ON_DEVICE_ENTITY_EXTRACTION_ANNOTATE(241),
    ON_DEVICE_ENTITY_EXTRACTION_CREATE(C14092c.f34607h0),
    ON_DEVICE_ENTITY_EXTRACTION_LOAD(243),
    ON_DEVICE_ENTITY_EXTRACTION_CLOSE(244),
    ON_DEVICE_ENTITY_EXTRACTION_DOWNLOAD(245),
    ON_DEVICE_OBJECT_CREATE(C14092c.f34557T),
    ON_DEVICE_OBJECT_LOAD(C14092c.f34560U),
    ON_DEVICE_OBJECT_INFERENCE(C17699g.f46051u),
    ON_DEVICE_OBJECT_CLOSE(194),
    ON_DEVICE_DI_CREATE(311),
    ON_DEVICE_DI_LOAD(312),
    ON_DEVICE_DI_DOWNLOAD(313),
    ON_DEVICE_DI_RECOGNIZE(314),
    ON_DEVICE_DI_CLOSE(315),
    ON_DEVICE_POSE_CREATE(321),
    ON_DEVICE_POSE_LOAD(322),
    ON_DEVICE_POSE_INFERENCE(323),
    ON_DEVICE_POSE_CLOSE(C14092c.f34639p0),
    ON_DEVICE_SEGMENTATION_CREATE(331),
    ON_DEVICE_SEGMENTATION_LOAD(C14092c.f34647r0),
    ON_DEVICE_SEGMENTATION_INFERENCE(333),
    ON_DEVICE_SEGMENTATION_CLOSE(334),
    CUSTOM_OBJECT_CREATE(341),
    CUSTOM_OBJECT_LOAD(342),
    CUSTOM_OBJECT_INFERENCE(343),
    CUSTOM_OBJECT_CLOSE(C14092c.f34655t0),
    CUSTOM_IMAGE_LABEL_CREATE(351),
    CUSTOM_IMAGE_LABEL_LOAD(C14092c.f34663v0),
    CUSTOM_IMAGE_LABEL_DETECT(353),
    CUSTOM_IMAGE_LABEL_CLOSE(354),
    CLOUD_FACE_DETECT(31),
    CLOUD_FACE_CREATE(32),
    CLOUD_FACE_CLOSE(33),
    CLOUD_CROP_HINTS_CREATE(41),
    CLOUD_CROP_HINTS_DETECT(42),
    CLOUD_CROP_HINTS_CLOSE(43),
    CLOUD_DOCUMENT_TEXT_CREATE(51),
    CLOUD_DOCUMENT_TEXT_DETECT(52),
    CLOUD_DOCUMENT_TEXT_CLOSE(53),
    CLOUD_IMAGE_PROPERTIES_CREATE(61),
    CLOUD_IMAGE_PROPERTIES_DETECT(62),
    CLOUD_IMAGE_PROPERTIES_CLOSE(63),
    CLOUD_IMAGE_LABEL_CREATE(71),
    CLOUD_IMAGE_LABEL_DETECT(72),
    CLOUD_IMAGE_LABEL_CLOSE(73),
    CLOUD_LANDMARK_CREATE(81),
    CLOUD_LANDMARK_DETECT(82),
    CLOUD_LANDMARK_CLOSE(83),
    CLOUD_LOGO_CREATE(91),
    CLOUD_LOGO_DETECT(92),
    CLOUD_LOGO_CLOSE(93),
    CLOUD_SAFE_SEARCH_CREATE(111),
    CLOUD_SAFE_SEARCH_DETECT(112),
    CLOUD_SAFE_SEARCH_CLOSE(113),
    CLOUD_TEXT_CREATE(121),
    CLOUD_TEXT_DETECT(122),
    CLOUD_TEXT_CLOSE(123),
    CLOUD_WEB_SEARCH_CREATE(131),
    CLOUD_WEB_SEARCH_DETECT(C14092c.f34515F),
    CLOUD_WEB_SEARCH_CLOSE(133),
    CUSTOM_MODEL_RUN(102),
    CUSTOM_MODEL_CREATE(103),
    CUSTOM_MODEL_CLOSE(104),
    CUSTOM_MODEL_LOAD(105),
    AUTOML_IMAGE_LABELING_RUN(181),
    AUTOML_IMAGE_LABELING_CREATE(182),
    AUTOML_IMAGE_LABELING_CLOSE(183),
    AUTOML_IMAGE_LABELING_LOAD(184),
    MODEL_DOWNLOAD(100),
    MODEL_UPDATE(101),
    REMOTE_MODEL_IS_DOWNLOADED(251),
    REMOTE_MODEL_DELETE_ON_DEVICE(252),
    ACCELERATION_ANALYTICS(260),
    AGGREGATED_AUTO_ML_IMAGE_LABELING_INFERENCE(200),
    AGGREGATED_CUSTOM_MODEL_INFERENCE(ComposerKt.f22642l),
    AGGREGATED_ON_DEVICE_BARCODE_DETECTION(ComposerKt.f22644n),
    AGGREGATED_ON_DEVICE_FACE_DETECTION(203),
    AGGREGATED_ON_DEVICE_IMAGE_LABEL_DETECTION(204),
    AGGREGATED_ON_DEVICE_OBJECT_INFERENCE(205),
    AGGREGATED_ON_DEVICE_TEXT_DETECTION(ComposerKt.f22650t),
    AGGREGATED_ON_DEVICE_POSE_DETECTION(ComposerKt.f22652v),
    AGGREGATED_ON_DEVICE_SEGMENTATION(C14092c.f34572Y),
    AGGREGATED_CUSTOM_OBJECT_INFERENCE(209),
    AGGREGATED_CUSTOM_IMAGE_LABEL_DETECTION(210),
    REMOTE_CONFIG_FETCH(271),
    REMOTE_CONFIG_ACTIVATE(272),
    REMOTE_CONFIG_LOAD(AudioAttributesCompat.f50016O),
    REMOTE_CONFIG_FRC_FETCH(281),
    INSTALLATION_ID_INIT(291),
    INSTALLATION_ID_REGISTER_NEW_ID(C14092c.f34627m0),
    INSTALLATION_ID_REFRESH_TEMPORARY_TOKEN(293),
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(301),
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(302),
    INPUT_IMAGE_CONSTRUCTION(361),
    HANDLE_LEAKED(371),
    CAMERA_SOURCE(381),
    OPTIONAL_MODULE_IMAGE_LABELING(391),
    OPTIONAL_MODULE_LANGUAGE_ID(401),
    OPTIONAL_MODULE_NLCLASSIFIER(411),
    NLCLASSIFIER_CLIENT_LIBRARY(421),
    OPTIONAL_MODULE_FACE_DETECTION(441),
    ACCELERATION_ALLOWLIST_GET(431),
    ACCELERATION_ALLOWLIST_FETCH(432),
    ODML_IMAGE(442);
    
    private final int zzbE;

    /* access modifiers changed from: public */
    zzfs(int i) {
        this.zzbE = i;
    }

    public final int zza() {
        return this.zzbE;
    }
}
