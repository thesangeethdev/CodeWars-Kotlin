//fun numUniqueEmails(emails: Array<String>): Int {
//
//}

fun main() {

//    val emails = arrayOf("test.email+alex@neetcode.com","test.e.mail+bob.cathy@neetcode.com","testemail+david@nee.tcode.com")
//    val emails = arrayOf("a@neetcode.com","b@neetcode.com","c@neetcode.com")
    val emails = arrayOf(
        "fg.r.u.uzj+o.pw@kziczvh.com",
        "r.cyo.g+d.h+b.ja@tgsg.z.com",
        "fg.r.u.uzj+o.f.d@kziczvh.com",
        "r.cyo.g+ng.r.iq@tgsg.z.com",
        "fg.r.u.uzj+lp.k@kziczvh.com",
        "r.cyo.g+n.h.e+n.g@tgsg.z.com",
        "fg.r.u.uzj+k+p.j@kziczvh.com",
        "fg.r.u.uzj+w.y+b@kziczvh.com",
        "r.cyo.g+x+d.c+f.t@tgsg.z.com",
        "r.cyo.g+x+t.y.l.i@tgsg.z.com",
        "r.cyo.g+brxxi@tgsg.z.com",
        "r.cyo.g+z+dr.k.u@tgsg.z.com",
        "r.cyo.g+d+l.c.n+g@tgsg.z.com",
        "fg.r.u.uzj+vq.o@kziczvh.com",
        "fg.r.u.uzj+uzq@kziczvh.com",
        "fg.r.u.uzj+mvz@kziczvh.com",
        "fg.r.u.uzj+taj@kziczvh.com",
        "fg.r.u.uzj+fek@kziczvh.com")

    var count = 0
    val uniqueEmails = mutableListOf<String>()
    emails.forEach { string ->
        var local = string.substringBefore('@')
        var domain = string.substringAfter('@')

        val localWithoutPlus = local.substringBefore('+')
        val cleanedDotLocal = localWithoutPlus.replace(".", "")

        val uniqueEmail = "$cleanedDotLocal@$domain"
        if (!uniqueEmails.contains(uniqueEmail)){
            uniqueEmails.add(uniqueEmail)
        }

    }
    println(uniqueEmails.size)

}