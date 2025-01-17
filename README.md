cUrl del endpoint

curl --location 'http://localhost:8080/api/books' \
--header 'Content-Type: application/json' \
--data '[
{
"id": 1,
"title": "The Hunger Games",
"pages": 374,
"summary": "Sixteen-year-old Katniss Everdeen, who lives alone with her mother and younger sister, regards it as a death sentence when she steps forward to take her sister'\''s place in the Games. But Katniss has been close to dead before—and survival, for her, is second nature. Without really meaning to, she becomes a contender. But if she is to win, she will have to start making choices that weight survival against humanity and life against love",
"author": {
"name": "Suzanne",
"firstSurname": "Collins",
"bio": "Since 1991, Suzanne Collins has been busy writing for children’s television. She has worked on the staffs of several Nickelodeon shows, including the Emmy-nominated hit Clarissa Explains it All and The Mystery Files of Shelby Woo"
}
},
{
"id": 2,
"title": "Harry Potter and the Sorcerer'\''s Stone",
"publicationTimestamp": "867308140",
"pages": 309,
"summary": "Harry Potter has no idea how famous he is. That'\''s because he'\''s being raised by his miserable aunt and uncle who are terrified Harry will learn that he'\''s really a wizard, just as his parents were. But everything changes when Harry is summoned to attend an infamous school for wizards, and he begins to discover some clues about his illustrious birthright",
"author": {
"name": "J.K. Rowling",
"bio": "Although she writes under the pen name J.K. Rowling, pronounced like rolling, her name when her first Harry Potter book was published was simply Joanne Rowling. Anticipating that the target audience of young boys might not want to read a book written by a woman, her publishers demanded that she use two initials, rather than her full name"
}
},
{
"id": 3,
"title": "The Help",
"publicationTimestamp": "1234252540",
"pages": 464,
"summary": "Twenty-two-year-old Skeeter has just returned home after graduating from Ole Miss. She may have a degree, but it is 1962, Mississippi, and her mother will not be happy till Skeeter has a ring on her finger. Skeeter would normally find solace with her beloved maid Constantine, the woman who raised her, but Constantine has disappeared and no one will tell Skeeter where she has gone.",
"author": {
"name": "Kathryn",
"firstSurname": "Stockett",
"bio": "Kathryn Stockett was born and raised in Jackson, Mississippi. After graduating from the University of Alabama with a degree in English and creative writing, she moved to New York City, where she worked in magazine publishing for nine years. She currently lives in Atlanta with her husband and daughter. She is working on her second novel."
}
},
{
"id": 4,
"title": "To Kill a Mockingbird",
"pages": 336,
"summary": "The unforgettable novel of a childhood in a sleepy Southern town and the crisis of conscience that rocked it. To Kill A Mockingbird became both an instant bestseller and a critical success when it was first published in 1960. It went on to win the Pulitzer Prize in 1961 and was later made into an Academy Award-winning film, also a classic.",
"author": {
"name": "Harper",
"firstSurname": "Lee",
"bio": "Harper Lee, known as Nelle, was born in the Alabama town of Monroeville, the youngest of four children of Amasa Coleman Lee and Frances Cunningham Finch Lee. Her father, a former newspaper editor and proprietor, was a lawyer who served on the state legislature from 1926 to 1938. As a child, Lee was a tomboy and a precocious reader, and enjoyed the friendship of her schoolmate and neighbor, the young Truman Capote."
}
},
{
"id": 5,
"title": "Harry Potter and the Deathly Hallows",
"publicationTimestamp": "1185000940",
"pages": 759,
"summary": "Harry has been burdened with a dark, dangerous and seemingly impossible task: that of locating and destroying Voldemort'\''s remaining Horcruxes. Never has Harry felt so alone, or faced a future so full of shadows. But Harry must somehow find within himself the strength to complete the task he has been given. He must leave the warmth, safety and companionship of The Burrow and follow without fear or hesitation the inexorable path laid out for him...",
"author": {
"name": "J.K. Rowling",
"bio": "Although she writes under the pen name J.K. Rowling, pronounced like rolling, her name when her first Harry Potter book was published was simply Joanne Rowling. Anticipating that the target audience of young boys might not want to read a book written by a woman, her publishers demanded that she use two initials, rather than her full name"
}
},
{
"id": 6,
"title": "The Kite Runner",
"publicationTimestamp": "1041407740",
"pages": 371,
"summary": "1970s Afghanistan: Twelve-year-old Amir is desperate to win the local kite-fighting tournament and his loyal friend Hassan promises to help him. But neither of the boys can foresee what would happen to Hassan that afternoon, an event that is to shatter their lives. After the Russians invade and the family is forced to flee to America, Amir realises that one day he must return to an Afghanistan under Taliban rule to find the one thing that his new world cannot grant him: redemption.",
"author": {
"name": "Khaled",
"firstSurname": "Hosseini",
"bio": "Hosseini was born in Kabul, Afghanistan, in 1965. In 1970 Hosseini and his family moved to Iran where his father worked for the Embassy of Afghanistan in Tehran. In 1973 Hosseini'\''s family returned to Kabul, and Hosseini'\''s youngest brother was born in July of that year. In 1976, when Hosseini was 11 years old, Hosseini'\''s father obtained a job in Paris, France, and moved the family there"
}
},
{
"id": 7,
"title": "The Stand",
"publicationTimestamp": "252489340",
"pages": 1152,
"summary": "First came the days of the plague. Then came the dreams. Dark dreams that warned of the coming of the dark man. The apostate of death, his worn-down boot heels tramping the night roads. The warlord of the charnel house and Prince of Evil. His time is at hand. His empire grows in the west and the Apocalypse looms.",
"author": {
"name": "Stephen",
"firstSurname": "King",
"bio": "Stephen Edwin King was born the second son of Donald and Nellie Ruth Pillsbury King. After his father left them when Stephen was two, he and his older brother, David, were raised by his mother. Parts of his childhood were spent in Fort Wayne, Indiana, where his father'\''s family was at the time, and in Stratford, Connecticut. When Stephen was eleven, his mother brought her children back to Durham, Maine, for good. Her parents, Guy and Nellie Pillsbury, had become incapacitated with old age, and Ruth King was persuaded by her sisters to take over the physical care of them. Other family members provided a small house in Durham and financial support. After Stephen'\''s grandparents passed away, Mrs. King found work in the kitchens of Pineland, a nearby residential facility for the mentally challenged."
}
},
{
"id": 8,
"title": "Life of Pi",
"publicationTimestamp": "1000191340",
"pages": 460,
"summary": "Life of Pi is a fantasy adventure novel by Yann Martel published in 2001. The protagonist, Piscine Molitor Pi Patel, a Tamil boy from Pondicherry, explores issues of spirituality and practicality from an early age. He survives 227 days after a shipwreck while stranded on a boat in the Pacific Ocean with a Bengal tiger named Richard Parker.",
"author": {
"name": "Yann",
"firstSurname": "Martel",
"bio": "Yann Martel is the author of Life of Pi, the #1 international bestseller and winner of the 2002 Man Booker (among many other prizes). He is also the award-winning author of The Facts Behind the Helsinki Roccamatios (winner of the Journey Prize), Self, Beatrice & Virgil, and 101 Letters to a Prime Minister. Born in Spain in 1963, Martel studied philosophy at Trent University, worked at odd jobs—tree planter, dishwasher, security guard—and traveled widely before turning to writing. He lives in Saskatoon, Canada, with the writer Alice Kuipers and their four children."
}
}
]'



Body de la llamada:

filter\src\main\java\com\example\data\books.json