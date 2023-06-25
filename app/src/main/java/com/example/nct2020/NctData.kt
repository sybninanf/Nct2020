package com.example.nct2020

import com.example.barvolume.R

object NctData {
    private val data = arrayOf(
        arrayOf(
            R.drawable.taeil_detail,
            "Moon Taeil",
            "14 Juni 1994",
            "Gemini",
            "Vokalis",
            "NCT U, NCT 127",
            "mo.on_air",
            "Moon Tae Il is a South Korean artist and member of SM Entertainment's boy group NCT and its sub-units, NCT 127 and NCT U.",
        ),
        arrayOf(
            R.drawable.jhonny_detail,
            "Jhonny Suh/Seo Young Ho",
            "9 Februari 1995",
            "Aquarius",
            "Rapper, Dancer, Vokalis",
            "NCT U, NCT 127",
            "johnnyjsuh",
            "John Suh (Korean name: Suh Young-ho), known by his stage name Johnny, is an American rapper, born in Chicago on February 9, 1995. He is one of the rappers and sub-vocalists of NCT 127. He is an only child and was accepted to SM through SM global auditors in Chicago. He was a host for radio host for NCT Night-Night with Jaehyun.",
        ),
        arrayOf(
            R.drawable.taeyong_detail,
            "Lee Taeyoung",
            "1 Juli 1995",
            "Cancer",
            "Leader, Rapper, Dancer, Vocalist, Face of the Group, Visual",
            "NCT U, NCT 127",
            "taeoxo_nct",
            "He was cast into SM Entertainment in 2012, discovered by street scouts in front of his school. In December 2013, he was introduced as a member of the pre-debut trainee team SMROOKIES.",
        ),
        arrayOf(
            R.drawable.yuta_detail,
            "Nakamoto Yuta",
            "26 Oktober 1995",
            "Scorpio",
            "Vokalis, Rapper, Dancer",
            "NCT U, NCT 127",
            "yuu_taa_1026",
            "Yuta was born and grew up in Osaka. His family consists of mother, father, older sister (born 1994), and younger sister (born 2000). He is the first Japanese artist to debut under SM Entertainment. He is a member of NCT U and NCT 127.",
             ),
        arrayOf(
            R.drawable.dy__detail,
            "Kim Doyoung",
            "1 Februari 1996",
            "Aquarius",
            "Vokalis",
            "NCT U, NCT 127",
            "do0_nct",
            "Kim Dong-young (Korean: 김동영; born February 1, 1996), professionally known as Doyoung (Korean: 도영), is a South Korean singer, actor, and host. He is best known as a member of the South Korean boy group NCT and its sub-units NCT U and NCT 127. Doyoung made his debut in April 2016 as a member of rotational unit NCT U and became a member of Seoul-based fixed unit NCT 127 in January 2017",
               ),
        arrayOf(
            R.drawable.jh_detail,
            "Jeong Jaehyun",
            "14 Februari 1997",
            "Aquarius",
            "Vokalis, Dancer, Rapper, Visual",
            "NCT U, NCT 127",
            "_jeongjaehyun",
            "Jaehyun is a singer, dancer and rapper with NCT 127. Jaehyun was interested in music from a young age, playing the piano and listening to R&B vocalists such as R. Kelly, whose signature song I Believe I Can Fly was his main inspiration for becoming an artist", "He is one of the members of the South Korea-based male idol group NCT and its sub-units NCT 127 and NCT U, though he has been on hiatus from NCT 127 since 2018.", "Kim Jung-woo (Hangul: 김정우) referred to as JUNGWOO (Hangul: 정우) is a South Korean singer and dancer born in Sanbon-dong, Gunpo-si, Gyeonggi-do on February 19, 1998 and grew up in Gimpo-si, Gyeonggi-do. He is the main vocalist and the lead dancer of NCT U, and the lead vocalist and lead dancer of NCT 127.", "Mark/ Lee Min-hyung, professionally known as Mark Lee, born on August 2, 1999, is a K-pop singer and rapper best known for being a member of the N.C.T. group. He has appeared on a South Korean rap show and served as an M.C. for a music show. He's also a songwriter, having written the words for two of the N.C.T.", "Lee Dong-hyuck (Hangul: 이동혁) known by his stage name HAECHAN (Hangul: 해찬) is a South Korean singer and dancer born in Seoul on June 6, 2000 (he later moved to Jeju Island with his family and grew up there before becoming a trainee). He is the main vocalist and the lead dancer of NCT 127, NCT DREAM, and NCT U."
        ),
        arrayOf(
            R.drawable.ww_detail,
            "Dong Sicheng",
            "28 Oktober 1997 ",
            "Scorpio",
            "Dancer, Vokalis",
            "wwiinn_7",
             "He is one of the members of the South Korea-based male idol group NCT and its sub-units NCT 127 and NCT U, though he has been on hiatus from NCT 127 since 2018.",
        ),

        arrayOf(
            R.drawable.jw_detail,
            "Kim Jungwoo",
            "19 Februari 1998",
            "Pisces",
            "Vokalis, Dancer",
            "NCT U, NCT 127",
            "sugaringcandy",
             "Kim Jung-woo (Hangul: 김정우) referred to as JUNGWOO (Hangul: 정우) is a South Korean singer and dancer born in Sanbon-dong, Gunpo-si, Gyeonggi-do on February 19, 1998 and grew up in Gimpo-si, Gyeonggi-do. He is the main vocalist and the lead dancer of NCT U, and the lead vocalist and lead dancer of NCT 127.",
     ),
        arrayOf(
            R.drawable.mark_detail,
            "Mark Lee",
            "2 Agustus 1999",
            "Leo",
            "Rapper, Dancer",
            "NCT 127, NCT Dream, NCT U",
            "onyourm__ark",
            "Mark/ Lee Min-hyung, professionally known as Mark Lee, born on August 2, 1999, is a K-pop singer and rapper best known for being a member of the N.C.T. group. He has appeared on a South Korean rap show and served as an M.C. for a music show. He's also a songwriter, having written the words for two of the N.C.T.",
        ),
        arrayOf(
            R.drawable.hc_detail,
            "Lee Haechan",
            "6 Juni 2000",
            "Gemini",
            "Vokalis, Rapper, Dancer",
            "NCT 127, NCT Dream, NCT U",
            "aechanahceah",
            "Lee Dong-hyuck (Hangul: 이동혁) known by his stage name HAECHAN (Hangul: 해찬) is a South Korean singer and dancer born in Seoul on June 6, 2000 (he later moved to Jeju Island with his family and grew up there before becoming a trainee). He is the main vocalist and the lead dancer of NCT 127, NCT DREAM, and NCT U."
        ),

        )

    val listDataNct: ArrayList<Nct>
        get() {
            val list = ArrayList<Nct>()
            for (aData in data) {
                val nct= Nct()
                nct.photo = aData[0] as Int
                nct.name = aData[1] as String
                nct.date  = aData[2] as String
                nct.zodiak = aData[3] as String
                nct.jabatan = aData[4] as String
                nct.sub = aData[5] as String
                nct.instagram = aData[6] as String
                nct.description = aData[7] as String

                list.add(nct)
            }
            return list
        }
}

