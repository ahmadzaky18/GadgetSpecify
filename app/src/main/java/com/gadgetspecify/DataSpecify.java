package com.gadgetspecify;

import java.util.ArrayList;

 class DataSpecify {
     private static String[] heroNames = {
             "Apple",
             "Samsung",
             "Xiaomi",
             "Sony",
             "Nokia",
             "Oppo",
             "Huawei",
             "Honor",
             "Google",
             "Asus",

     };
     static String[][] data = new String[][]{
            {"Samsung Galaxy A30s","Network \tTechnology \t\n" +
                    "GSM / HSPA / LTE\n" +
                    "Launch \tAnnounced \t2019, August\n" +
                    "Status \tComing soon. Exp. release 2019, September\n" +
                    "Body \tDimensions \t158.5 x 74.7 x 7.8 mm (6.24 x 2.94 x 0.31 in)\n" +
                    "Weight \t166 g (5.86 oz)\n" +
                    "SIM \tSingle SIM (Nano-SIM) or Dual SIM (Nano-SIM, dual stand-by)\n" +
                    "Display \tType \tSuper AMOLED capacitive touchscreen, 16M colors\n" +
                    "Size \t6.4 inches, 100.5 cm2 (~84.9% screen-to-body ratio)\n" +
                    "Resolution \t720 x 1560 pixels, 19.5:9 ratio (~268 ppi density)\n" +
                    "Protection \tUnspecified\n" +
                    "Platform \tOS \tAndroid 9.0 (Pie)\n" +
                    "Chipset \tExynos 7885 (14 nm)\n" +
                    "CPU \tOcta-core (2x1.8 GHz Cortex-A73 & 6x1.6 GHz Cortex-A53)\n" +
                    "GPU \tMali-G71\n" +
                    "Memory \tCard slot \tmicroSD, up to 1 TB (dedicated slot)\n" +
                    "Internal \t32GB 3GB RAM, 64GB 4GB RAM, 128GB 4GB RAM\n" +
                    "Main Camera \tTriple \t25 MP, f/1.7, PDAF\n" +
                    "8 MP, f/2.2, 13mm (ultrawide)\n" +
                    "5 MP, f/2.2, depth sensor\n" +
                    "Features \tLED flash, panorama, HDR\n" +
                    "Video \t1080p@30fps\n" +
                    "Selfie camera \tSingle \t16 MP, f/2.0\n" +
                    "Video \t1080p@30fps\n" +
                    "Sound \tLoudspeaker \tYes\n" +
                    "3.5mm jack \tYes\n" +
                    " \tActive noise cancellation with dedicated mic\n" +
                    "Comms \tWLAN \tWi-Fi 802.11 a/b/g/n/ac, dual-band, Wi-Fi Direct, hotspot\n" +
                    "Bluetooth \t5.0, A2DP, LE\n" +
                    "GPS \tYes, with A-GPS, GLONASS, BDS\n" +
                    "Radio \tFM radio\n" +
                    "USB \t2.0, Type-C 1.0 reversible connector\n" +
                    "Features \tSensors \tFingerprint (under display, optical), accelerometer, proximity, compass\n" +
                    "Battery \t  \tNon-removable Li-Po 4000 mAh battery\n" +
                    "Charging \tFast battery charging 15W\n" +
                    "Misc \tColors \tPrism Crush Black, Prism Crush White, Prism Crush Green, Prism Crush Violet2\n" +
                    "Models \tSM-A307F, SM-A307FN, SM-A307G, SM-A307GN, SM-A307YN"
                    },
             {"Xiaomi Black Shark 2 Pro ," +
                     "Network \tTechnology \t\n" + "GSM / CDMA / HSPA / EVDO / LTE\n" +
                     "Launch \tAnnounced \t2019, July\n" +
                     "Status \tComing soon. Exp. release 2019, September\n" +
                     "Body \tDimensions \t163.6 x 75 x 8.8 mm (6.44 x 2.95 x 0.35 in)\n" +
                     "Weight \t205 g (7.23 oz)\n" +
                     "Build \tFront glass, aluminum body\n" +
                     "SIM \tDual SIM (Nano-SIM, dual stand-by)\n" +
                     "Display \tType \tAMOLED capacitive touchscreen, 16M colors\n" +
                     "Size \t6.39 inches, 100.2 cm2 (~81.7% screen-to-body ratio)\n" +
                     "Resolution \t1080 x 2340 pixels, 19.5:9 ratio (~403 ppi density)\n" +
                     " \tDCI-P3 100%\n" +
                     "Always-on display\n" +
                     "240 Hz touch-sensing\n" +
                     "Platform \tOS \tAndroid 9.0 (Pie)\n" +
                     "Chipset \tQualcomm SDM855 Snapdragon 855+ (7 nm)\n" +
                     "CPU \tOcta-core (1x2.96 GHz Kryo 485 & 3x2.42 GHz Kryo 485 & 4x1.78 GHz Kryo 485)\n" +
                     "GPU \tAdreno 640 (700 MHz)\n" +
                     "Memory \tCard slot \tNo\n" +
                     "Internal \t128GB 8GB RAM, 128GB 12GB RAM, 256GB 12GB RAM\n" +
                     "Main Camera \tDual \t48 MP, f/1.8, (wide), 1/2\", 0.8µm, PDAF\n" +
                     "12 MP, f/2.2, (telephoto), 1.0µm, PDAF, 2x optical zoom\n" +
                     "Features \tLED flash, HDR, panorama\n" +
                     "Video \t2160p@30/60fps, 1080p@30/60fps, 720p@1920fps\n" +
                     "Selfie camera \tSingle \t20 MP, f/2.0, 0.9µm\n" +
                     "Features \tHDR\n" +
                     "Video \t1080p@30fps\n" +
                     "Sound \tLoudspeaker \tYes, with stereo speakers\n" +
                     "3.5mm jack \tNo\n" +
                     " \tActive noise cancellation with dedicated mic\n" +
                     "Comms \tWLAN \tWi-Fi 802.11 a/b/g/n/ac, dual-band, Wi-Fi Direct, hotspot\n" +
                     "Bluetooth \t5.0, A2DP, aptX HD, LE\n" +
                     "GPS \tYes, with A-GPS, GLONASS, GALILEO, QZSS, BDS\n" +
                     "Radio \tNo\n" +
                     "USB \t2.0, Type-C 1.0 reversible connector\n" +
                     "Features \tSensors \tFingerprint (under display, optical), accelerometer, gyro, proximity, compass\n" +
                     "Battery \t  \tNon-removable Li-Ion 4000 mAh battery\n" +
                     "Charging \tFast battery charging 27W\n" +
                     "Misc \tColors \tElectric black, Ice ash\n" +
                     "Price \tAbout 450 EUR"},
             {"Asus ROG Phone II ,Network \tTechnology \t\n" +
                     "GSM / HSPA / LTE\n" +
                     "Launch \tAnnounced \t2019, July\n" +
                     "Status \tComing soon. Exp. release 2019, September\n" +
                     "Body \tDimensions \t171 x 77.6 x 9.5 mm (6.73 x 3.06 x 0.37 in)\n" +
                     "Weight \t240 g (8.47 oz)\n" +
                     "Build \tFront glass (Gorilla Glass 6), back glass, aluminum frame\n" +
                     "SIM \tDual SIM (Nano-SIM, dual stand-by)\n" +
                     "Display \tType \tAMOLED capacitive touchscreen, 16M colors\n" +
                     "Size \t6.59 inches, 106.6 cm2 (~80.3% screen-to-body ratio)\n" +
                     "Resolution \t1080 x 2340 pixels, 19.5:9 ratio (~391 ppi density)\n" +
                     "Protection \tCorning Gorilla Glass 6\n" +
                     " \tDCI-P3 108%\n" +
                     "HDR10\n" +
                     "120 Hz\n" +
                     "240 Hz touch-sensing\n" +
                     "Platform \tOS \tAndroid 9.0 (Pie), ROG UI\n" +
                     "Chipset \tQualcomm SDM855 Snapdragon 855+ (7 nm)\n" +
                     "CPU \tOcta-core (1x2.96 GHz Kryo 485 & 3x2.42 GHz Kryo 485 & 4x1.78 GHz Kryo 485)\n" +
                     "GPU \tAdreno 640 (700 MHz)\n" +
                     "Memory \tCard slot \tNo\n" +
                     "Internal \t256GB 12GB RAM, 512GB 12GB RAM\n" +
                     "Main Camera \tDual \t48 MP, f/1.8, 26mm (wide), 1/2\", 0.8µm, PDAF, Laser AF\n" +
                     "13 MP, f/2.4, 11mm (ultrawide)\n" +
                     "Features \tDual-LED flash, HDR, panorama\n" +
                     "Video \t2160p@30/60fps, 1080p@30/60/240fps, 720p@480fps; gyro-EIS (except @240/480fps)\n" +
                     "Selfie camera \tSingle \t24MP, f/2.2\n" +
                     "Features \tPanorama, HDR\n" +
                     "Video \t1080p@30fps\n" +
                     "Sound \tLoudspeaker \tYes, with stereo speakers\n" +
                     "3.5mm jack \tYes\n" +
                     " \t24-bit/192kHz audio\n" +
                     "Active noise cancellation with dedicated mics\n" +
                     "DTS Headphone X\n" +
                     "Comms \tWLAN \tWi-Fi 802.11 a/b/g/n/ac/ad, dual-band, Wi-Fi Direct, hotspot\n" +
                     "Bluetooth \t5.0, A2DP, LE, aptX HD\n" +
                     "GPS \tYes, with dual-band A-GPS, GLONASS, BDS, GALILEO, QZSS\n" +
                     "NFC \tYes\n" +
                     "Radio \tNo\n" +
                     "USB \t3.1, Type-C 1.0 reversible connector; accessory connector\n" +
                     "Features \tSensors \tFingerprint (under display, optical), accelerometer, gyro, proximity, compass\n" +
                     "Battery \t  \tNon-removable Li-Po 6000 mAh battery\n" +
                     "Charging \tFast battery charging 30W (Quick Charge 4.0)\n" +
                     "Power bank/Reverse charging 10W\n" +
                     "Misc \tColors \tBlack\n" +
                     "Price \tAbout 900 EUR"},
             {"Apple iPhone XS ,Network \tTechnology \t\n" +
                     "GSM / CDMA / HSPA / EVDO / LTE\n" +
                     "Launch \tAnnounced \t2018, September\n" +
                     "Status \tAvailable. Released 2018, September\n" +
                     "Body \tDimensions \t143.6 x 70.9 x 7.7 mm (5.65 x 2.79 x 0.30 in)\n" +
                     "Weight \t177 g (6.24 oz)\n" +
                     "Build \tFront/back glass, stainless steel frame\n" +
                     "SIM \tNano-SIM, Electronic SIM card (eSIM)\n" +
                     " \tIP68 dust/water resistant (up to 2m for 30 mins)\n" +
                     "Apple Pay (Visa, MasterCard, AMEX certified)\n" +
                     "Display \tType \tOLED capacitive touchscreen, 16M colors\n" +
                     "Size \t5.8 inches, 84.4 cm2 (~82.9% screen-to-body ratio)\n" +
                     "Resolution \t1125 x 2436 pixels, 19.5:9 ratio (~458 ppi density)\n" +
                     "Protection \tScratch-resistant glass, oleophobic coating\n" +
                     " \tDolby Vision; HDR10; Wide color gamut; 3D Touch; True-tone; 120 Hz touch-sensing\n" +
                     "Platform \tOS \tiOS 12, upgradable to iOS 12.4\n" +
                     "Chipset \tApple A12 Bionic (7 nm)\n" +
                     "CPU \tHexa-core (2x2.5 GHz Vortex + 4x1.6 GHz Tempest)\n" +
                     "GPU \tApple GPU (4-core graphics)\n" +
                     "Memory \tCard slot \tNo\n" +
                     "Internal \t64GB 4GB RAM, 256GB 4GB RAM, 512GB 4GB RAM\n" +
                     "Main Camera \tDual \t12 MP, f/1.8, 26mm (wide), 1/2.55\", 1.4µm, PDAF, OIS\n" +
                     "12 MP, f/2.4, 52mm (telephoto), 1/3.4\", 1.0µm, PDAF, OIS, 2x optical zoom\n" +
                     "Features \tQuad-LED dual-tone flash, HDR (photo/panorama)\n" +
                     "Video \t2160p@24/30/60fps, 1080p@30/60/120/240fps, HDR, stereo sound rec.\n" +
                     "Selfie camera \tDual \t7 MP, f/2.2, 32mm (standard)\n" +
                     "TOF 3D camera\n" +
                     "Features \tHDR\n" +
                     "Video \t1080p@60fps\n" +
                     "Sound \tLoudspeaker \tYes, with stereo speakers\n" +
                     "3.5mm jack \tNo\n" +
                     " \tActive noise cancellation with dedicated mic\n" +
                     "Comms \tWLAN \tWi-Fi 802.11 a/b/g/n/ac, dual-band, hotspot\n" +
                     "Bluetooth \t5.0, A2DP, LE\n" +
                     "GPS \tYes, with A-GPS, GLONASS, GALILEO, QZSS\n" +
                     "NFC \tYes\n" +
                     "Radio \tNo\n" +
                     "USB \t2.0, proprietary reversible connector\n" +
                     "Features \tSensors \tFace ID, accelerometer, gyro, proximity, compass, barometer\n" +
                     " \tSiri natural language commands and dictation\n" +
                     "Battery \t  \tNon-removable Li-Ion 2658 mAh battery (10.13 Wh)\n" +
                     "Charging \tFast battery charging 15W: 50% in 30 min\n" +
                     "USB Power Delivery 2.0\n" +
                     "Qi wireless charging\n" +
                     "Talk time \tUp to 20 h (3G)\n" +
                     "Music play \tUp to 60 h\n" +
                     "Misc \tColors \tSpace Gray, Silver, Gold\n" +
                     "Models \tA2097, A1920, A2100, A2098\n" +
                     "SAR \t1.19 W/kg (head)     1.18 W/kg (body)    \n" +
                     "SAR EU \t0.99 W/kg (head)     0.99 W/kg (body)    \n" +
                     "Price \tAbout 1150 EUR\n" +
                     "Tests \tPerformance \tBasemark OS II 2.0: 6060\n" +
                     "Display \tContrast ratio: Infinite (nominal), 5.171 (sunlight)\n" +
                     "Camera \tPhoto / Video\n" +
                     "Loudspeaker \tVoice 71dB / Noise 75dB / Ring 78dB\n" +
                     "Audio quality \tNoise -93.7dB / Crosstalk -82.8dB\n" +
                     "Battery life \t\n" +
                     "Endurance rating 72h"},
             {"Google Pixel 3 XL ,Network \tTechnology \t\n" +
                     "GSM / CDMA / HSPA / EVDO / LTE\n" +
                     "Launch \tAnnounced \t2018, October\n" +
                     "Status \tAvailable. Released 2018, November\n" +
                     "Body \tDimensions \t158 x 76.7 x 7.9 mm (6.22 x 3.02 x 0.31 in)\n" +
                     "Weight \t184 g (6.49 oz)\n" +
                     "Build \tFront/back glass (Gorilla Glass 5), aluminum frame\n" +
                     "SIM \tNano-SIM card & eSIM\n" +
                     " \tIP68 dust/water resistant (up to 1.5m for 30 mins)\n" +
                     "Display \tType \tP-OLED capacitive touchscreen, 16M colors\n" +
                     "Size \t6.3 inches, 100.3 cm2 (~82.8% screen-to-body ratio)\n" +
                     "Resolution \t1440 x 2960 pixels, 18.5:9 ratio (~523 ppi density)\n" +
                     "Protection \tCorning Gorilla Glass 5\n" +
                     " \tDCI-P3 100%\n" +
                     "HDR\n" +
                     "Always-on display\n" +
                     "Platform \tOS \tAndroid 9.0 (Pie)\n" +
                     "Chipset \tQualcomm SDM845 Snapdragon 845 (10 nm)\n" +
                     "CPU \tOcta-core (4x2.5 GHz Kryo 385 Gold & 4x1.6 GHz Kryo 385 Silver)\n" +
                     "GPU \tAdreno 630\n" +
                     "Memory \tCard slot \tNo\n" +
                     "Internal \t64GB 4GB RAM, 128GB 4GB RAM\n" +
                     "Main Camera \tSingle \t12.2 MP, f/1.8, 28mm (wide), 1/2.55\", 1.4µm, dual pixel PDAF, OIS\n" +
                     "Features \tDual-LED flash, Auto-HDR, panorama\n" +
                     "Video \t2160p@30fps, 1080p@30/60/120fps, 720p@240fps, 1080p@30fps (gyro-EIS)\n" +
                     "Selfie camera \tDual \t8 MP, f/1.8, 28mm (wide), PDAF\n" +
                     "8 MP, f/2.2, 19mm (ultrawide), no AF\n" +
                     "Features \tAuto-HDR\n" +
                     "Video \t1080p@30fps\n" +
                     "Sound \tLoudspeaker \tYes, with stereo speakers\n" +
                     "3.5mm jack \tNo\n" +
                     " \tActive noise cancellation with dedicated mic\n" +
                     "Comms \tWLAN \tWi-Fi 802.11 a/b/g/n/ac, dual-band, Wi-Fi Direct, DLNA, hotspot\n" +
                     "Bluetooth \t5.0, A2DP, LE, aptX HD\n" +
                     "GPS \tYes, with A-GPS, GLONASS, BDS, GALILEO\n" +
                     "NFC \tYes\n" +
                     "Radio \tNo\n" +
                     "USB \t3.1, Type-C 1.0 reversible connector\n" +
                     "Features \tSensors \tFingerprint (rear-mounted), accelerometer, gyro, proximity, compass, barometer\n" +
                     "Battery \t  \tNon-removable Li-Po 3430 mAh battery\n" +
                     "Charging \tFast battery charging 18W\n" +
                     "USB Power Delivery 2.0\n" +
                     "QI wireless charging\n" +
                     "Misc \tColors \tClearly White, Just Black, Not Pink\n" +
                     "Models \tPixel 3 XL\n" +
                     "Price \tAbout 960 EUR"},
             {"Huawei nova 5i Pro ,Network \tTechnology \t\n" +
                     "GSM / CDMA / HSPA / LTE\n" +
                     "Launch \tAnnounced \t2019, July\n" +
                     "Status \tAvailable. Released 2019, July\n" +
                     "Body \tDimensions \t156.1 x 73.9 x 8.3 mm (6.15 x 2.91 x 0.33 in)\n" +
                     "Weight \t178 g (6.28 oz)\n" +
                     "SIM \tHybrid Dual SIM (Nano-SIM, dual stand-by)\n" +
                     "Display \tType \tLTPS IPS LCD capacitive touchscreen, 16M colors\n" +
                     "Size \t6.26 inches, 96.2 cm2 (~83.4% screen-to-body ratio)\n" +
                     "Resolution \t1080 x 2340 pixels, 19.5:9 ratio (~412 ppi density)\n" +
                     "Platform \tOS \tAndroid 9.0 (Pie), EMUI 9.1\n" +
                     "Chipset \tHiSilicon Kirin 810 (7 nm)\n" +
                     "CPU \tOcta-core (2x2.27 GHz Cortex-A76 & 6x1.88 GHz Cortex-A55)\n" +
                     "GPU \tMali-G52 MP6\n" +
                     "Memory \tCard slot \tNM (Nano Memory), up to 256GB (uses shared SIM slot)\n" +
                     "Internal \t128GB 6GB RAM, 128GB 8GB RAM, 256GB 8GB RAM\n" +
                     "Main Camera \tQuad \t48 MP, f/1.8, 26mm (wide), 1/2\", 0.8µm, PDAF\n" +
                     "8 MP, (ultrawide)\n" +
                     "2 MP, f/2.4, 27mm (wide) dedicated macro camera\n" +
                     "2 MP, f/2.4, depth sensor\n" +
                     "Features \tLED flash, HDR, panorama\n" +
                     "Video \t2160p@30fps, 1080p@30fps\n" +
                     "Selfie camera \tSingle \t32 MP, f/2.0\n" +
                     "Features \tHDR\n" +
                     "Video \t1080p@30fps\n" +
                     "Sound \tLoudspeaker \tYes\n" +
                     "3.5mm jack \tYes\n" +
                     " \tActive noise cancellation with dedicated mic\n" +
                     "Comms \tWLAN \tWi-Fi 802.11 a/b/g/n/ac, dual-band, Wi-Fi Direct, hotspot\n" +
                     "Bluetooth \t5.0, A2DP, LE\n" +
                     "GPS \tYes, with A-GPS, GLONASS, GALILEO, QZSS, BDS\n" +
                     "Radio \tFM radio\n" +
                     "USB \t2.0, Type-C 1.0 reversible connector, USB On-The-Go\n" +
                     "Features \tSensors \tFingerprint (rear-mounted), accelerometer, gyro, proximity, compass\n" +
                     "Battery \t  \tNon-removable Li-Po 4000 mAh battery\n" +
                     "Charging \tFast battery charging 20W\n" +
                     "Misc \tColors \tBlack, Aurora, Emerald Green\n" +
                     "Models \tSPN-AL00, SPN-TL00\n" +
                     "Price \tAbout 290 EUR"},
             {"Honor 9X ,Network \tTechnology \t\n" +
                     "GSM / HSPA / LTE\n" +
                     "Launch \tAnnounced \t2019, July\n" +
                     "Status \tAvailable. Released 2019, July\n" +
                     "Body \tDimensions \t163.1 x 77.2 x 8.8 mm (6.42 x 3.04 x 0.35 in)\n" +
                     "Weight \t206 g (7.27 oz)\n" +
                     "SIM \tSingle SIM (Nano-SIM) or Dual SIM (Nano-SIM, dual stand-by)\n" +
                     "Display \tType \tLTPS IPS LCD capacitive touchscreen, 16M colors\n" +
                     "Size \t6.59 inches, 106.6 cm2 (~84.7% screen-to-body ratio)\n" +
                     "Resolution \t1080 x 2340 pixels, 19.5:9 ratio (~391 ppi density)\n" +
                     "Platform \tOS \tAndroid 9.0 (Pie); EMUI 9.1\n" +
                     "Chipset \tHiSilicon Kirin 810 (7 nm)\n" +
                     "CPU \tOcta-core (2x2.27 GHz Cortex-A76 & 6x1.88 GHz Cortex-A55)\n" +
                     "GPU \tMali-G52\n" +
                     "Memory \tCard slot \tmicroSD, up to 512 GB\n" +
                     "Internal \t64GB 4GB RAM, 64GB 6GB RAM, 128GB 6GB RAM\n" +
                     "Main Camera \tDual \t48 MP, f/1.8, (wide), 1/2\", PDAF\n" +
                     "2 MP, f/2.4, (depth sensor)\n" +
                     "Features \tLED flash, HDR, panorama\n" +
                     "Video \t1080p@30fps\n" +
                     "Selfie camera \tSingle \tMotorized pop-up 16 MP, f/2.2\n" +
                     "Video \t1080p@30fps\n" +
                     "Sound \tLoudspeaker \tYes\n" +
                     "3.5mm jack \tYes\n" +
                     " \tActive noise cancellation with dedicated mic\n" +
                     "Comms \tWLAN \tWi-Fi 802.11 a/b/g/n/ac, dual-band, Wi-Fi Direct, hotspot\n" +
                     "Bluetooth \t5.0, A2DP, LE\n" +
                     "GPS \tYes, with A-GPS, GLONASS, BDS\n" +
                     "Radio \tFM radio\n" +
                     "USB \t2.0, Type-C 1.0 reversible connector\n" +
                     "Features \tSensors \tFingerprint (side-mounted), accelerometer, gyro, proximity, compass\n" +
                     "Battery \t  \tNon-removable Li-Po 4000 mAh battery\n" +
                     "Charging \tBattery charging 10W\n" +
                     "Misc \tColors \tMagic Night Black, Charm Sea Blue, Charm Red\n" +
                     "Models \tHLK-AL00, HLK-TL00\n" +
                     "Price \tAbout 180 EUR"},
             {"Nokia 3.1 A ,\n" +
                     "Network \tTechnology \t\n" +
                     "GSM / HSPA / LTE\n" +
                     "Launch \tAnnounced \t2019, June\n" +
                     "Status \tAvailable. Released 2019, June\n" +
                     "Body \tDimensions \t152.7 x 71.9 x 9.4 mm (6.01 x 2.83 x 0.37 in)\n" +
                     "Weight \t156 g (5.50 oz)\n" +
                     "SIM \tNano-SIM\n" +
                     "Display \tType \tIPS LCD capacitive touchscreen, 16M colors\n" +
                     "Size \t5.45 inches, 76.7 cm2 (~69.8% screen-to-body ratio)\n" +
                     "Resolution \t720 x 1440 pixels, 18:9 ratio (~295 ppi density)\n" +
                     "Platform \tOS \tAndroid 9.0 (Pie)\n" +
                     "Chipset \tQualcomm SDM429 Snapdragon 429\n" +
                     "CPU \tQuad-core 1.8 GHz Cortex-A53\n" +
                     "GPU \tAdreno 504\n" +
                     "Memory \tCard slot \tmicroSD, up to 128 GB\n" +
                     "Internal \t32GB 2GB RAM\n" +
                     "Main Camera \tSingle \t8 MP, f/2.0, AF\n" +
                     "Features \tLED flash, HDR, panorama\n" +
                     "Video \t1080p@30fps\n" +
                     "Selfie camera \tSingle \t5 MP, f/2.2\n" +
                     "Features \tHDR\n" +
                     "Video \t720p@30fps\n" +
                     "Sound \tLoudspeaker \tYes\n" +
                     "3.5mm jack \tYes\n" +
                     "Comms \tWLAN \tWi-Fi 802.11 b/g/n, hotspot\n" +
                     "Bluetooth \t5.0, A2DP, LE\n" +
                     "GPS \tYes, with A-GPS, GLONASS, BDS\n" +
                     "Radio \tFM radio\n" +
                     "USB \t2.0, Type-C 1.0 reversible connector\n" +
                     "Features \tSensors \tAccelerometer, gyro, proximity\n" +
                     "Battery \t  \tNon-removable Li-Ion 2990 mAh battery\n" +
                     "Charging \tBattery charging 10W\n" +
                     "Misc \tColors \tBlack\n" +
                     "Models \tTA1140"},
             {"Oppo A9 ,Network \tTechnology \t\n" +
                     "GSM / CDMA / HSPA / LTE\n" +
                     "Launch \tAnnounced \t2019, April\n" +
                     "Status \tAvailable. Released 2019, April\n" +
                     "Body \tDimensions \t162 x 76.1 x 8.3 mm (6.38 x 3.00 x 0.33 in)\n" +
                     "Weight \t190 g (6.70 oz)\n" +
                     "SIM \tDual SIM (Nano-SIM, dual stand-by)\n" +
                     "Display \tType \tLTPS IPS LCD capacitive touchscreen, 16M colors\n" +
                     "Size \t6.53 inches, 104.7 cm2 (~84.9% screen-to-body ratio)\n" +
                     "Resolution \t1080 x 2340 pixels, 19.5:9 ratio (~395 ppi density)\n" +
                     "Platform \tOS \tAndroid 9.0 (Pie); ColorOS 6\n" +
                     "Chipset \tMediatek MT6771V Helio P70 (12nm)\n" +
                     "CPU \tOcta-core (4x2.1 GHz Cortex-A73 & 4x2.0 GHz Cortex-A53)\n" +
                     "GPU \tMali-G72 MP3\n" +
                     "Memory \tCard slot \tmicroSD, up to 256 GB\n" +
                     "Internal \t128GB 4GB RAM, 128GB 8GB RAM\n" +
                     "Main Camera \tDual \t16 MP, f/1.8, AF\n" +
                     "2 MP, f/2.4, depth sensor\n" +
                     "Features \tDual-LED dual-tone flash, panorama, HDR\n" +
                     "Video \t1080p@30fps\n" +
                     "Selfie camera \tSingle \t16 MP, f/2.0\n" +
                     "Features \tHDR\n" +
                     "Video \t1080p@30fps\n" +
                     "Sound \tLoudspeaker \tYes\n" +
                     "3.5mm jack \tYes\n" +
                     " \tActive noise cancellation with dedicated mic\n" +
                     "Comms \tWLAN \tWi-Fi 802.11 a/b/g/n/ac, dual-band, Wi-Fi Direct, hotspot\n" +
                     "Bluetooth \t4.2, A2DP, LE\n" +
                     "GPS \tYes, with A-GPS, GLONASS, BDS\n" +
                     "NFC \tYes\n" +
                     "Radio \tFM radio\n" +
                     "USB \tmicroUSB 2.0, USB On-The-Go\n" +
                     "Features \tSensors \tFingerprint (rear-mounted), accelerometer, gyro, proximity, compass\n" +
                     "Battery \t  \tNon-removable Li-Po 4020 mAh battery\n" +
                     "Misc \tColors \tMica Green, Ice Jade White, Fluorite Purple\n" +
                     "Models \tPCAM10, CPH1938\n" +
                     "Price \tAbout 190 EUR"},
             {"Sony Xperia 1 ,Network \tTechnology \t\n" +
                     "GSM / HSPA / LTE\n" +
                     "Launch \tAnnounced \t2019, February\n" +
                     "Status \tAvailable. Released 2019, June\n" +
                     "Body \tDimensions \t167 x 72 x 8.2 mm (6.57 x 2.83 x 0.32 in)\n" +
                     "Weight \t178 g (6.28 oz)\n" +
                     "Build \tFront/back glass (Gorilla Glass 6) & aluminum frame\n" +
                     "SIM \tSingle SIM (Nano-SIM) or Hybrid Dual SIM (Nano-SIM, dual stand-by)\n" +
                     " \tIP65/IP68 dust/water proof (up to 1.5m for 30 mins)\n" +
                     "Display \tType \tOLED capacitive touchscreen, 16M colors\n" +
                     "Size \t6.5 inches, 98.6 cm2 (~82.0% screen-to-body ratio)\n" +
                     "Resolution \t1644 x 3840 pixels, 21:9 ratio (~643 ppi density)\n" +
                     "Protection \tCorning Gorilla Glass 6\n" +
                     " \tDCI-P3 100%\n" +
                     "HDR BT.2020\n" +
                     "Triluminos display\n" +
                     "X-Reality Engine\n" +
                     "Platform \tOS \tAndroid 9.0 (Pie)\n" +
                     "Chipset \tQualcomm SDM855 Snapdragon 855 (7 nm)\n" +
                     "CPU \tOcta-core (1x2.84 GHz Kryo 485 & 3x2.42 GHz Kryo 485 & 4x1.78 GHz Kryo 485)\n" +
                     "GPU \tAdreno 640\n" +
                     "Memory \tCard slot \tmicroSD, up to 1 TB (uses shared SIM slot) - dual SIM model only\n" +
                     "Internal \t64GB 6GB RAM, 128GB 6GB RAM\n" +
                     "Main Camera \tTriple \t12 MP, f/1.6, 26mm (wide), 1/2.6\", 1.4µm, predictive Dual Pixel PDAF, 5-axis OIS\n" +
                     "12 MP, f/2.4, 52mm (telephoto), 1/3.4\", 1.0µm, predictive PDAF, 2x optical zoom, 5-axis OIS\n" +
                     "12 MP, f/2.4, 16mm (ultrawide), 1/3.4\", 1.0µm\n" +
                     "Features \tLED flash, panorama, HDR, eye tracking\n" +
                     "Video \t2160p@24/30fps HDR, 1080p@60fps, 1080p@30fps (5-axis gyro-EIS), 1080p@960fps\n" +
                     "Selfie camera \tSingle \t8 MP, f/2.0, 24mm (wide), 1/4\", 1.12µm\n" +
                     "Features \tHDR\n" +
                     "Video \t1080p@30fps (5-axis gyro-EIS)\n" +
                     "Sound \tLoudspeaker \tYes, with stereo speakers\n" +
                     "3.5mm jack \tNo\n" +
                     " \t24-bit/192kHz audio\n" +
                     "Dynamic vibration system\n" +
                     "Active noise cancellation with dedicated mic\n" +
                     "Dolby Atmos sound\n" +
                     "Comms \tWLAN \tWi-Fi 802.11 a/b/g/n/ac, dual-band, Wi-Fi Direct, DLNA, hotspot\n" +
                     "Bluetooth \t5.0, A2DP, aptX HD, LE\n" +
                     "GPS \tYes, with A-GPS, GLONASS, BDS, GALILEO\n" +
                     "NFC \tYes\n" +
                     "Radio \tNo\n" +
                     "USB \t3.1, Type-C 1.0 reversible connector; USB Host\n" +
                     "Features \tSensors \tFingerprint (side-mounted), accelerometer, gyro, proximity, barometer, compass, color spectrum\n" +
                     "Battery \t  \tNon-removable Li-Ion 3330 mAh battery\n" +
                     "Charging \tFast battery charging 18W (USB Power Delivery 2.0)\n" +
                     "USB Power Delivery\n" +
                     "Misc \tColors \tBlack, Gray, Purple, White\n" +
                     "Models \tJ8110, J8170, J9110\n" +
                     "Price \tAbout 950 EUR\n" +
                     "Tests \tPerformance \tBasemark OS II: 4526 / Basemark OS II 2.0: 4211\n" +
                     "Basemark X: 44600\n" +
                     "Display \tContrast ratio: Infinite (nominal)\n" +
                     "Camera \tPhoto / Video\n" +
                     "Loudspeaker \tVoice 69dB / Noise 74dB / Ring 81dB\n" +
                     "Audio quality \tNoise -93.6dB / Crosstalk -85.2dB\n" +
                     "Battery life \t\n" +
                     "Endurance rating 79h"},
    };













     static ArrayList<ModelSpecify> getListData(){
        ArrayList<ModelSpecify> specifyArrayList = new ArrayList<>();
        for (String[] aData : data) {
            ModelSpecify modelSpecify = new ModelSpecify();
            modelSpecify.setNama(aData[0]);
            modelSpecify.setRelease(aData[1]);

            specifyArrayList.add(modelSpecify);
        }
        return specifyArrayList;
    }
}
