package com.kamleshgorasiya.player.dbTest

import com.kamleshgorasiya.player.data.local.Movies

object FakeData {
    fun createMovies(): List<Movies> {
        return listOf(
                Movies(
                        genre = "Fantasy , Serial",
                        imdb = "9.5",
                        duration = "1h 02min",
                        year = 2011,
                        id = 1,
                        title = "Game of Thrones",
                        description = "Game of Thrones is an American fantasy drama television series created by David Benioff and D. B. Weiss. It is an adaptation of A Song of Ice and Fire, George R. R. Martin's series of fantasy novels, the first of which is A Game of Thrones. It is filmed in Belfast and elsewhere in the United Kingdom, Canada, Croatia, Iceland, Malta, Morocco, Spain, and the United States. The series premiered on HBO in the United States on April 17, 2011, and its seventh season ended on August 27, 2017. The series will conclude with its eighth season premiering in 2019.Set on the fictional continents of Westeros and Essos, Game of Thrones has several plot lines and a large ensemble cast but centers on three primary story arcs. The first story arc centers on the Iron Throne of the Seven Kingdoms and follows a web of alliances and conflicts among the dynastic noble families either vying to claim the throne or fighting for independence from the throne. The second story arc focuses on the last descendant of the realm's deposed ruling dynasty, exiled and plotting a return to the throne. The third story arc centers on the longstanding brotherhood charged with defending the realm against the ancient threats of the fierce peoples and legendary creatures that lie far north, and an impending winter that threatens the realm.",
                        poster = "https://firebasestorage.googleapis.com/v0/b/rashiddemo-2eca3.appspot.com/o/a954krk3f25z.jpg?alt=media&token=c5d73a1d-8c5d-427d-8235-e52a1448f28f",
                        videoUrl = "https://firebasestorage.googleapis.com/v0/b/rashiddemo-2eca3.appspot.com/o/Game%20of%20Thrones%20Season%207-%20Official%20Trailer%20(HBO).mp4?alt=media&token=0bd8a226-bf32-460e-bfc0-ae0ade28c2a5"
                ),
                Movies(
                        genre = "Fiction",
                        imdb = "8.9",
                        duration = "0h 45min",
                        year = 2016,
                        id = 2,
                        title = "Stranger Things",
                        description = "Stranger Things is an American science fiction-horror web television series created, written, and directed by the Duffer Brothers. The Duffer Brothers, Shawn Levy, and Dan Cohen serve as executive producers. The first season, released in July 2016, stars Winona Ryder, David Harbour, Finn Wolfhard, Millie Bobby Brown, Gaten Matarazzo, Caleb McLaughlin, Natalia Dyer, Charlie Heaton, Cara Buono and Matthew Modine, with Noah Schnapp and Joe Keery in recurring roles. For the second season, Schnapp and Keery were promoted to series regulars, along with the additions of Sadie Sink, Dacre Montgomery, Sean Astin and Paul Reiser.Set in the fictional town of Hawkins, Indiana, in the 1980s, the first season focuses on the investigation into the disappearance of a young boy amid supernatural events occurring around the town, including the appearance of a girl with psychokinetic abilities who helps the missing boy's friends in their own search. The second season, titled Stranger Things 2, is set a year after the first, and deals with attempts of the characters to return to normal and consequences that linger from the first season.",
                        poster = "https://firebasestorage.googleapis.com/v0/b/rashiddemo-2eca3.appspot.com/o/stranger_things-HD.jpg?alt=media&token=b156267d-07a9-4f22-a8d8-fc2ff6863bf5",
                        videoUrl = "https://firebasestorage.googleapis.com/v0/b/rashiddemo-2eca3.appspot.com/o/stranger_things_trailer.mp4?alt=media&token=4fec1399-77d3-448f-8e98-91aaa3426d38"
                ),
                Movies(
                        genre = "Science Fiction",
                        imdb = "8.9",
                        duration = "0h 58min",
                        year = 2016,
                        id = 3,
                        title = "Westworld",
                        description = "Westworld is an American science fiction western thriller television series created by Jonathan Nolan and Lisa Joy for HBO. It is based on the 1973 film of the same name, which was written and directed by American novelist Michael Crichton, and to a lesser extent on the 1976 sequel Futureworld. It is the second TV series based on the two films, the first being the short-lived 1980 series Beyond Westworld. Nolan and Joy serve as executive producers along with J. J. Abrams, Jerry Weintraub, and Bryan Burk, with Nolan directing the pilot. The first season premiered on October 2, 2016, concluded on December 4, 2016, and consisted of ten episodes.[3] In November 2016, HBO renewed the show for a ten-episode second season,[4] which is set to premiere on April 22, 2018.The story takes place in the fictional Westworld, a technologically advanced Wild West-themed amusement park populated by android hosts. Westworld caters to high-paying guests, who may indulge in whatever they wish within the park, without fear of retaliation from the hosts.",
                        poster = "https://firebasestorage.googleapis.com/v0/b/rashiddemo-2eca3.appspot.com/o/westworld_s2.jpg?alt=media&token=99a3c1d2-4165-4a41-9b67-9604273d73c4",
                        videoUrl = "https://firebasestorage.googleapis.com/v0/b/rashiddemo-2eca3.appspot.com/o/westworld_season_two.mp4?alt=media&token=53dfd0c7-f5d4-49c3-8a0d-79b64de32d2f"
                ),
                Movies(
                        genre = "Science Fiction",
                        imdb = "9.5",
                        duration = "0h 45min",
                        year = 2008,
                        id = 4,
                        title = "Breaking Bad",
                        description = "Breaking Bad is an American neo-western crime drama television series created and produced by Vince Gilligan. The show originally aired on the AMC network for five seasons, from January 20, 2008 to September 29, 2013. It tells the story of Walter White (Bryan Cranston), a struggling high school chemistry teacher diagnosed with lung cancer. Together with his former student Jesse Pinkman (Aaron Paul), White turns to a life of crime by producing and selling crystallized methamphetamine to secure his family's financial future before he dies, while navigating the dangers of the criminal world. The title comes from the Southern colloquialism breaking bad, meaning to raise hell or turn toward crime.[5] Breaking Bad is set and filmed in Albuquerque, New Mexico.Walter's family consists of his wife Skyler (Anna Gunn) and children, Walter, Jr. (RJ Mitte) and Holly (Elanor Anne Wenrich). The show also features Skyler's sister Marie Schrader (Betsy Brandt), and her husband Hank (Dean Norris), a Drug Enforcement Administration (DEA) agent. Walter hires lawyer Saul Goodman (Bob Odenkirk), who connects him with private investigator and fixer Mike Ehrmantraut (Jonathan Banks) and in turn Mike's employer, drug kingpin Gus Fring (Giancarlo Esposito). The final season introduces the characters Todd Alquist (Jesse Plemons) and Lydia Rodarte-Quayle (Laura Fraser).",
                        poster = "https://firebasestorage.googleapis.com/v0/b/rashiddemo-2eca3.appspot.com/o/breaking-bad-ps-vr.jpg?alt=media&token=d0ce3269-eb12-4597-b442-2a8e29d08817",
                        videoUrl = "https://firebasestorage.googleapis.com/v0/b/rashiddemo-2eca3.appspot.com/o/Breaking%20Bad%20Trailer%20(First%20Season).mp4?alt=media&token=d36b0ba3-98da-4695-90ae-d9c449d8284a"
                ),
                Movies(
                        genre = "Thriller film/Action",
                        imdb = "8.5",
                        duration = "2h 05min",
                        year = 2018,
                        id = 5,
                        title = "Mission Impossible : Fallout",
                        description = "Mission: Impossible – Fallout is an upcoming American action spy film written, directed and produced by Christopher McQuarrie. It is the sixth installment in the Mission: Impossible film series and stars Tom Cruise, Rebecca Ferguson, Ving Rhames, Simon Pegg, Michelle Monaghan, Alec Baldwin, and Sean Harris who all reprise their roles from previous films. Henry Cavill, Vanessa Kirby, Sian Brooke, and Angela Bassett will join the franchise. The film is scheduled to be released on July 27, 2018, and will be the first in the series to be released in RealD 3D and IMAX 3D. The film will also have a 2D IMAX release. McQuarrie is also the first director to direct two films in the franchise.",
                        poster = "https://firebasestorage.googleapis.com/v0/b/rashiddemo-2eca3.appspot.com/o/MI6_Online_Teaser_Vertical_rgb.jpg?alt=media&token=a22bffe6-44fb-4a64-a989-83557a612795",
                        videoUrl = "https://firebasestorage.googleapis.com/v0/b/rashiddemo-2eca3.appspot.com/o/mission_impossible_6.mp4?alt=media&token=6cf01fbb-6667-4ccc-8ac5-9910752bf19d"
                )
        )
    }

}

