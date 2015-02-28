package com.malmstein.hnews.json;

public class CommentsJson {

    public final static String askStoryComments = "\n" +
            "<html><head><meta name=\"referrer\" content=\"origin\"></meta><link rel=\"stylesheet\" type=\"text/css\" href=\"news.css?xyEygGaeVqJ4FjFHBljf\"></link><link rel=\"shortcut icon\" href=\"favicon.ico\"></link><script type=\"text/javascript\">\n" +
            "function byId(id) {\n" +
            "  return document.getElementById(id);\n" +
            "}\n" +
            "\n" +
            "function vote(node) {\n" +
            "  var v = node.id.split(/_/);   // {'up', '123'}\n" +
            "  var item = v[1];\n" +
            "\n" +
            "  // hide arrows\n" +
            "  byId('up_'   + item).style.visibility = 'hidden';\n" +
            "  byId('down_' + item).style.visibility = 'hidden';\n" +
            "\n" +
            "  // ping server\n" +
            "  var ping = new Image();\n" +
            "  ping.src = node.href;\n" +
            "\n" +
            "  return false; // cancel browser nav\n" +
            "} </script><title>Ask HN: How do I start with test driven development? | Hacker News</title></head><body><center><table id=\"hnmain\" op=\"item\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"85%\" bgcolor=\"#f6f6ef\"><tr><td bgcolor=\"#ff6600\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"padding:2px\"><tr><td style=\"width:18px;padding-right:4px\"><a href=\"http://www.ycombinator.com\"><img src=\"y18.gif\" width=\"18\" height=\"18\" style=\"border:1px #ffffff solid;\"></img></a></td><td style=\"line-height:12pt; height:10px;\"><span class=\"pagetop\"><b><a href=\"news\">Hacker News</a></b><img src=\"s.gif\" height=\"1\" width=\"10\"><a href=\"newest\">new</a> | <a href=\"newcomments\">comments</a> | <a href=\"show\">show</a> | <a href=\"ask\">ask</a> | <a href=\"jobs\">jobs</a> | <a href=\"submit\">submit</a></span></td><td style=\"text-align:right;padding-right:4px;\"><span class=\"pagetop\"><a href=\"login?goto=item%3Fid%3D9085695\">login</a></span></td></tr></table></td></tr><tr style=\"height:10px\"></tr><tr><td><table border=\"0\"><tr><td><center><a id=\"up_9085695\" href=\"vote?for=9085695&amp;dir=up&amp;goto=item%3Fid%3D9085695\"><div class=\"votearrow\" title=\"upvote\"></div></a><span id=\"down_9085695\"></span></center></td><td class=\"title\"><span class=\"deadmark\"></span><a href=\"item?id=9085695\">Ask HN: How do I start with test driven development?</a></td></tr><tr><td colspan=\"1\"></td><td class=\"subtext\"><span class=\"score\" id=\"score_9085695\">17 points</span> by <a href=\"user?id=pravj\">pravj</a> <a href=\"item?id=9085695\">1 hour ago</a>  | <a href=\"item?id=9085695\">4 comments</a></td></tr><tr style=\"height:2px\"></tr><tr><td></td><td>I&#x27;m a student developer, @pravj on GitHub.\n" +
            "I try to follow the best possible development practice when I&#x27;m working like documentation, respecting language&#x27;s style guide etc.<p>But one thing I don&#x27;t like with me is that I never write tests.<p>Why I never followed that aspect is because I always felt that the thing that I&#x27;m writing, sounds totally OK.<p>One another negative point is that I don&#x27;t actually get it that How to do&#x2F;start this and what type of tests I should write for any given project. Maybe this is because I have never done this before.<p>For example recently I wrote a identicons library, Penticons[1]. It generates GitHub contribution flavored identicons. You can read the development story here[2].<p>Now, the thing that stopped me from writing tests was, I thought that ultimately it&#x27;s a image generation library, why this thing needs any tests.<p>I don&#x27;t want to lost my 1 point in the Joel score. Whenever I see a <i>build passing</i> label on a GitHub repository, It makes me crazy.<p>I&#x27;m asking here because I just love HN, I know people will suggest some awesome things here.<p>1. https:&#x2F;&#x2F;github.com&#x2F;penticons&#x2F;penticons.go<p>2. http:&#x2F;&#x2F;pravj.github.io&#x2F;blog&#x2F;penticons-the-hash-game&#x2F;</td></tr><tr style=\"height:10px\"></tr><tr><td></td><td><form method=\"post\" action=\"comment\"><input type=\"hidden\" name=\"parent\" value=\"9085695\"><input type=\"hidden\" name=\"goto\" value=\"item?id=9085695\"><input type=\"hidden\" name=\"hmac\" value=\"f324a21873b430972992e1d8ffe5696acd82a0c5\"><textarea name=\"text\" rows=\"6\" cols=\"60\" style=\"\" placeholder=\"\"></textarea><br><br>\n" +
            "<input type=\"submit\" value=\"add comment\"></form></td></tr></table><br><br>\n" +
            "<table border=\"0\"><tr><td><table border=\"0\"><tr><td><img src=\"s.gif\" height=\"1\" width=\"0\"></td><td valign=\"top\"><center><a id=\"up_9085876\" href=\"vote?for=9085876&amp;dir=up&amp;goto=item%3Fid%3D9085695\"><div class=\"votearrow\" title=\"upvote\"></div></a><span id=\"down_9085876\"></span></center></td><td class=\"default\"><div style=\"margin-top:2px; margin-bottom:-10px; \"><span class=\"comhead\"><a href=\"user?id=ollysb\">ollysb</a> <a href=\"item?id=9085876\">9 minutes ago</a> <span class=\"deadmark\"></span></span></div><br>\n" +
            "<span class=\"comment\"><font color=\"#000000\">I can&#x27;t recommend the discussion between Kent Beck, David Hansson and Martin Fowler enough. They look at how and where it should be used and in particular discuss their approach to mocking which I feel is an often misunderstood tool.<p>Part 1 - <a href=\"https://www.youtube.com/watch?v=z9quxZsLcfo\" rel=\"nofollow\">https:&#x2F;&#x2F;www.youtube.com&#x2F;watch?v=z9quxZsLcfo</a>\n" +
            "Part 2 - <a href=\"https://www.youtube.com/watch?v=JoTB2mcjU7w\" rel=\"nofollow\">https:&#x2F;&#x2F;www.youtube.com&#x2F;watch?v=JoTB2mcjU7w</a>\n" +
            "Part 3 - <a href=\"https://www.youtube.com/watch?v=YNw4baDz6WA\" rel=\"nofollow\">https:&#x2F;&#x2F;www.youtube.com&#x2F;watch?v=YNw4baDz6WA</a>\n" +
            "Part 4&#x2F;5 - <a href=\"https://www.youtube.com/watch?v=gWD6REVeKW4\" rel=\"nofollow\">https:&#x2F;&#x2F;www.youtube.com&#x2F;watch?v=gWD6REVeKW4</a></font></span><p><font size=\"1\"><u><a href=\"reply?id=9085876&amp;goto=item%3Fid%3D9085695\">reply</a></u></font></td></tr></table></td></tr><tr><td><table border=\"0\"><tr><td><img src=\"s.gif\" height=\"1\" width=\"0\"></td><td valign=\"top\"><center><a id=\"up_9085745\" href=\"vote?for=9085745&amp;dir=up&amp;goto=item%3Fid%3D9085695\"><div class=\"votearrow\" title=\"upvote\"></div></a><span id=\"down_9085745\"></span></center></td><td class=\"default\"><div style=\"margin-top:2px; margin-bottom:-10px; \"><span class=\"comhead\"><a href=\"user?id=defenestration\">defenestration</a> <a href=\"item?id=9085745\">53 minutes ago</a> <span class=\"deadmark\"></span></span></div><br>\n" +
            "<span class=\"comment\"><font color=\"#000000\">I can give you some pointers.\n" +
            "1) A good discussion about Unit Testing on Hacker News. Is most unit testing a waste or not? <a href=\"https://news.ycombinator.com/item?id=7353767\" rel=\"nofollow\">https:&#x2F;&#x2F;news.ycombinator.com&#x2F;item?id=7353767</a><p>2) A story about unit testing at Airbnb: <a href=\"http://nerds.airbnb.com/testing-at-airbnb/\" rel=\"nofollow\">http:&#x2F;&#x2F;nerds.airbnb.com&#x2F;testing-at-airbnb&#x2F;</a><p>3) Practical tips for test driven development:\n" +
            "<a href=\"http://soundsoftware.ac.uk/unit-testing-why-bother/\" rel=\"nofollow\">http:&#x2F;&#x2F;soundsoftware.ac.uk&#x2F;unit-testing-why-bother&#x2F;</a></font></span><p><font size=\"1\"><u><a href=\"reply?id=9085745&amp;goto=item%3Fid%3D9085695\">reply</a></u></font></td></tr></table></td></tr><tr><td><table border=\"0\"><tr><td><img src=\"s.gif\" height=\"1\" width=\"40\"></td><td valign=\"top\"><center><a id=\"up_9085888\" href=\"vote?for=9085888&amp;dir=up&amp;goto=item%3Fid%3D9085695\"><div class=\"votearrow\" title=\"upvote\"></div></a><span id=\"down_9085888\"></span></center></td><td class=\"default\"><div style=\"margin-top:2px; margin-bottom:-10px; \"><span class=\"comhead\"><a href=\"user?id=pravj\">pravj</a> <a href=\"item?id=9085888\">6 minutes ago</a> <span class=\"deadmark\"></span></span></div><br>\n" +
            "<span class=\"comment\"><font color=\"#000000\">Reading the Airbnb story now, thanks for the links.</font></span><p><font size=\"1\"><u><a href=\"reply?id=9085888&amp;goto=item%3Fid%3D9085695\">reply</a></u></font></td></tr></table></td></tr><tr><td><table border=\"0\"><tr><td><img src=\"s.gif\" height=\"1\" width=\"0\"></td><td valign=\"top\"><center><a id=\"up_9085864\" href=\"vote?for=9085864&amp;dir=up&amp;goto=item%3Fid%3D9085695\"><div class=\"votearrow\" title=\"upvote\"></div></a><span id=\"down_9085864\"></span></center></td><td class=\"default\"><div style=\"margin-top:2px; margin-bottom:-10px; \"><span class=\"comhead\"><a href=\"user?id=michaelmcmillan\">michaelmcmillan</a> <a href=\"item?id=9085864\">11 minutes ago</a> <span class=\"deadmark\"></span></span></div><br>\n" +
            "<span class=\"comment\"><font color=\"#000000\">I got into it by watching DAS (destroyallsoftware.com) by Gary Bernhardt (creator of the WAT presentation), it has truly shaped me into a better developer. Not only will you learn how to practice TDD, but so much more: refactoring, unix tools, OO-principles ... I could go on forever, it&#x27;s really a great series.</font></span><p><font size=\"1\"><u><a href=\"reply?id=9085864&amp;goto=item%3Fid%3D9085695\">reply</a></u></font></td></tr></table></td></tr></table><br><br>\n" +
            "</td></tr><tr><td><img src=\"s.gif\" height=\"10\" width=\"0\"><table width=\"100%\" cellspacing=\"0\" cellpadding=\"1\"><tr><td bgcolor=\"#ff6600\"></td></tr></table><br>\n" +
            "<center><center><a href=\"http://www.ycombinator.com/apply/\">Applications are open for YC Summer 2015</a></center><br><br>\n" +
            "<span class=\"yclinks\"><a href=\"newsguidelines.html\">Guidelines</a> | <a href=\"newsfaq.html\">FAQ</a> | <a href=\"mailto:hn@ycombinator.com\">Support</a> | <a href=\"lists\">Lists</a> | <a href=\"bookmarklet.html\">Bookmarklet</a> | <a href=\"dmca.html\">DMCA</a> | <a href=\"http://www.ycombinator.com/\">Y Combinator</a> | <a href=\"http://www.ycombinator.com/apply/\">Apply</a> | <a href=\"mailto:hn@ycombinator.com\">Contact</a></span><br><br>\n" +
            "<form method=\"get\" action=\"//hn.algolia.com/\">Search: <input type=\"text\" name=\"q\" value=\"\" size=\"17\"></form></center></td></tr></table></center></body></html>";

    public final static String newsComments = "\n" +
            "<html><head><meta name=\"referrer\" content=\"origin\"></meta><link rel=\"stylesheet\" type=\"text/css\" href=\"news.css?xyEygGaeVqJ4FjFHBljf\"></link><link rel=\"shortcut icon\" href=\"favicon.ico\"></link><script type=\"text/javascript\">\n" +
            "function byId(id) {\n" +
            "  return document.getElementById(id);\n" +
            "}\n" +
            "\n" +
            "function vote(node) {\n" +
            "  var v = node.id.split(/_/);   // {'up', '123'}\n" +
            "  var item = v[1];\n" +
            "\n" +
            "  // hide arrows\n" +
            "  byId('up_'   + item).style.visibility = 'hidden';\n" +
            "  byId('down_' + item).style.visibility = 'hidden';\n" +
            "\n" +
            "  // ping server\n" +
            "  var ping = new Image();\n" +
            "  ping.src = node.href;\n" +
            "\n" +
            "  return false; // cancel browser nav\n" +
            "} </script><title>Apple calling developers to migrate their garbage collector apps to ARC | Hacker News</title></head><body><center><table id=\"hnmain\" op=\"item\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"85%\" bgcolor=\"#f6f6ef\"><tr><td bgcolor=\"#ff6600\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"padding:2px\"><tr><td style=\"width:18px;padding-right:4px\"><a href=\"http://www.ycombinator.com\"><img src=\"y18.gif\" width=\"18\" height=\"18\" style=\"border:1px #ffffff solid;\"></img></a></td><td style=\"line-height:12pt; height:10px;\"><span class=\"pagetop\"><b><a href=\"news\">Hacker News</a></b><img src=\"s.gif\" height=\"1\" width=\"10\"><a href=\"newest\">new</a> | <a href=\"newcomments\">comments</a> | <a href=\"show\">show</a> | <a href=\"ask\">ask</a> | <a href=\"jobs\">jobs</a> | <a href=\"submit\">submit</a></span></td><td style=\"text-align:right;padding-right:4px;\"><span class=\"pagetop\"><a href=\"login?goto=item%3Fid%3D9085563\">login</a></span></td></tr></table></td></tr><tr style=\"height:10px\"></tr><tr><td><table border=\"0\"><tr><td><center><a id=\"up_9085563\" href=\"vote?for=9085563&amp;dir=up&amp;goto=item%3Fid%3D9085563\"><div class=\"votearrow\" title=\"upvote\"></div></a><span id=\"down_9085563\"></span></center></td><td class=\"title\"><span class=\"deadmark\"></span><a href=\"https://developer.apple.com/news/?id=02202015a\">Apple calling developers to migrate their garbage collector apps to ARC</a><span class=\"sitebit comhead\"> (apple.com)</span></td></tr><tr><td colspan=\"1\"></td><td class=\"subtext\"><span class=\"score\" id=\"score_9085563\">24 points</span> by <a href=\"user?id=tachion\">tachion</a> <a href=\"item?id=9085563\">1 hour ago</a>  | <a href=\"item?id=9085563\">12 comments</a></td></tr><tr style=\"height:10px\"></tr><tr><td></td><td><form method=\"post\" action=\"comment\"><input type=\"hidden\" name=\"parent\" value=\"9085563\"><input type=\"hidden\" name=\"goto\" value=\"item?id=9085563\"><input type=\"hidden\" name=\"hmac\" value=\"c5784fa0661b3f18909201fb0ab842a4deb374ef\"><textarea name=\"text\" rows=\"6\" cols=\"60\" style=\"\" placeholder=\"\"></textarea><br><br>\n" +
            "<input type=\"submit\" value=\"add comment\"></form></td></tr></table><br><br>\n" +
            "<table border=\"0\"><tr><td><table border=\"0\"><tr><td><img src=\"s.gif\" height=\"1\" width=\"0\"></td><td valign=\"top\"><center><a id=\"up_9085764\" href=\"vote?for=9085764&amp;dir=up&amp;goto=item%3Fid%3D9085563\"><div class=\"votearrow\" title=\"upvote\"></div></a><span id=\"down_9085764\"></span></center></td><td class=\"default\"><div style=\"margin-top:2px; margin-bottom:-10px; \"><span class=\"comhead\"><a href=\"user?id=zbowling\">zbowling</a> <a href=\"item?id=9085764\">6 minutes ago</a> <span class=\"deadmark\"></span></span></div><br>\n" +
            "<span class=\"comment\"><font color=\"#000000\">To head off some of the misconceptions here, this is not about garbage collection in general but Objective-C built-in garbage collection.<p>Apple NEEDs to do this for their own sanity.<p>It&#x27;s a serious PITA to support GC and non GC at the same time in a framework. Having to add finalizer methods instead of relaying on dealloc methods and dealing with non-deterministic object lifetime as well as deterministic was a huge problem.<p>ARC doesn&#x27;t have these problems because it wraps traditional manual reference counting (to pick nits, it actually bypasses it when it can safely but this is an optimization detail that you shouldn&#x27;t need to worry about).<p>To Apple and 3rd party framework developers, it&#x27;s painful to support GC and non-GC paths in your code at the sametime. It&#x27;s not really possible to use a non-GC compatible framework in a GC app.<p>It&#x27;s also impossible to use ARC and still support the GC as well in the same framework. Apple has been completely <i>prevented</i> from using ARC in it&#x27;s own frameworks because of keeping GC compatible apps working, and making this change will allow them to start ARC-ifying their own code.<p>It also means that a significant chunk of the ObjC runtime can be simplified.<p>There are also some great advancements in the ObjC runtime that Apple is doing (like tagged pointers and shadow objects) that the reference boehm garbage collector can&#x27;t really deal with and was all completely disabled in the ObjC runtime when you had a GC app.<p>This is a good thing. Not many app actually shipped with the ObjC garbage collector and ran well.<p>Now you are free to use your GC for your own needs in your app. That has nothing to do with ObjC. Feel free to add Java or Ruby or whatever language you like to your own app and submit that to the Mac App Store.</font></span><p><font size=\"1\"><u><a href=\"reply?id=9085764&amp;goto=item%3Fid%3D9085563\">reply</a></u></font></td></tr></table></td></tr><tr><td><table border=\"0\"><tr><td><img src=\"s.gif\" height=\"1\" width=\"0\"></td><td valign=\"top\"><center><a id=\"up_9085771\" href=\"vote?for=9085771&amp;dir=up&amp;goto=item%3Fid%3D9085563\"><div class=\"votearrow\" title=\"upvote\"></div></a><span id=\"down_9085771\"></span></center></td><td class=\"default\"><div style=\"margin-top:2px; margin-bottom:-10px; \"><span class=\"comhead\"><a href=\"user?id=amit_m\">amit_m</a> <a href=\"item?id=9085771\">2 minutes ago</a> <span class=\"deadmark\"></span></span></div><br>\n" +
            "<span class=\"comment\"><font color=\"#000000\">Does ARC work like reference counting in python? (i.e. a reference count is stored for every object)</font></span><p><font size=\"1\"><u><a href=\"reply?id=9085771&amp;goto=item%3Fid%3D9085563\">reply</a></u></font></td></tr></table></td></tr><tr><td><table border=\"0\"><tr><td><img src=\"s.gif\" height=\"1\" width=\"0\"></td><td valign=\"top\"><center><a id=\"up_9085702\" href=\"vote?for=9085702&amp;dir=up&amp;goto=item%3Fid%3D9085563\"><div class=\"votearrow\" title=\"upvote\"></div></a><span id=\"down_9085702\"></span></center></td><td class=\"default\"><div style=\"margin-top:2px; margin-bottom:-10px; \"><span class=\"comhead\"><a href=\"user?id=danbruc\">danbruc</a> <a href=\"item?id=9085702\">29 minutes ago</a> <span class=\"deadmark\"></span></span></div><br>\n" +
            "<span class=\"comment\"><font color=\"#000000\">What is the reasoning behind that? Given the advances over the last decade or two automatic garbage collection is good enough for a lot of scenarios and this looks like a step back. Why not use automatic garbage collection as the default but offer additional means for manual resource management in case it is really needed?</font></span><p><font size=\"1\"><u><a href=\"reply?id=9085702&amp;goto=item%3Fid%3D9085563\">reply</a></u></font></td></tr></table></td></tr><tr><td><table border=\"0\"><tr><td><img src=\"s.gif\" height=\"1\" width=\"40\"></td><td valign=\"top\"><center><a id=\"up_9085758\" href=\"vote?for=9085758&amp;dir=up&amp;goto=item%3Fid%3D9085563\"><div class=\"votearrow\" title=\"upvote\"></div></a><span id=\"down_9085758\"></span></center></td><td class=\"default\"><div style=\"margin-top:2px; margin-bottom:-10px; \"><span class=\"comhead\"><a href=\"user?id=ttflee\">ttflee</a> <a href=\"item?id=9085758\">9 minutes ago</a> <span class=\"deadmark\"></span></span></div><br>\n" +
            "<span class=\"comment\"><font color=\"#000000\">IMHO, they want to get everything that has a UI as responsive as possible.<p>GC in theory is a good feature but it does not guarantee that constant time is used for each mark-and-sweep cycle. And together with multithreading that means uncertainty for rendering every frame of video, which is done in the main thread of an App 60 times per second. And for modern system, anything you see on screen is part of this rendering. Try to think about how could memory shared by main thread and a background thread. It could turn out to be: halting the process for GC, retaining some memory forever, or implementing some complicated algorithm that is too difficult to debug&#x2F;maintain.</font></span><p><font size=\"1\"><u><a href=\"reply?id=9085758&amp;goto=item%3Fid%3D9085563\">reply</a></u></font></td></tr></table></td></tr><tr><td><table border=\"0\"><tr><td><img src=\"s.gif\" height=\"1\" width=\"80\"></td><td valign=\"top\"><center><a id=\"up_9085766\" href=\"vote?for=9085766&amp;dir=up&amp;goto=item%3Fid%3D9085563\"><div class=\"votearrow\" title=\"upvote\"></div></a><span id=\"down_9085766\"></span></center></td><td class=\"default\"><div style=\"margin-top:2px; margin-bottom:-10px; \"><span class=\"comhead\"><a href=\"user?id=oconnor0\">oconnor0</a> <a href=\"item?id=9085766\">5 minutes ago</a> <span class=\"deadmark\"></span></span></div><br>\n" +
            "<span class=\"comment\"><font color=\"#000000\">That can be resolved with a different GC.</font></span><p><font size=\"1\"><u><a href=\"reply?id=9085766&amp;goto=item%3Fid%3D9085563\">reply</a></u></font></td></tr></table></td></tr><tr><td><table border=\"0\"><tr><td><img src=\"s.gif\" height=\"1\" width=\"120\"></td><td valign=\"top\"><center><a id=\"up_9085775\" href=\"vote?for=9085775&amp;dir=up&amp;goto=item%3Fid%3D9085563\"><div class=\"votearrow\" title=\"upvote\"></div></a><span id=\"down_9085775\"></span></center></td><td class=\"default\"><div style=\"margin-top:2px; margin-bottom:-10px; \"><span class=\"comhead\"><a href=\"user?id=ttflee\">ttflee</a> <a href=\"item?id=9085775\">1 minute ago</a> <span class=\"deadmark\"></span></span></div><br>\n" +
            "<span class=\"comment\"><font color=\"#000000\">Yes, I have heard of some algorithms that consume a lot more memory to balance timing.</font></span><p><font size=\"1\"><font color=\"#f6f6ef\">-----</font></font></td></tr></table></td></tr><tr><td><table border=\"0\"><tr><td><img src=\"s.gif\" height=\"1\" width=\"40\"></td><td valign=\"top\"><center><a id=\"up_9085755\" href=\"vote?for=9085755&amp;dir=up&amp;goto=item%3Fid%3D9085563\"><div class=\"votearrow\" title=\"upvote\"></div></a><span id=\"down_9085755\"></span></center></td><td class=\"default\"><div style=\"margin-top:2px; margin-bottom:-10px; \"><span class=\"comhead\"><a href=\"user?id=threeseed\">threeseed</a> <a href=\"item?id=9085755\">11 minutes ago</a> <span class=\"deadmark\"></span></span></div><br>\n" +
            "<span class=\"comment\"><font color=\"#000000\">Probably because Apple is moving towards a unified iOS&#x2F;OSX SDK. We have seen evidence of this with the Photos app which uses UXKit (unified AppKit&#x2F;UIKit). I would imagine that Apple is pushing developers towards this new SDK landscape step by step starting with ARC.<p>There is a precedence for Apple doing this usually related to a new hardware platform e.g. x86, 64-bit and perhaps ARM Macs.</font></span><p><font size=\"1\"><u><a href=\"reply?id=9085755&amp;goto=item%3Fid%3D9085563\">reply</a></u></font></td></tr></table></td></tr><tr><td><table border=\"0\"><tr><td><img src=\"s.gif\" height=\"1\" width=\"40\"></td><td valign=\"top\"><center><a id=\"up_9085736\" href=\"vote?for=9085736&amp;dir=up&amp;goto=item%3Fid%3D9085563\"><div class=\"votearrow\" title=\"upvote\"></div></a><span id=\"down_9085736\"></span></center></td><td class=\"default\"><div style=\"margin-top:2px; margin-bottom:-10px; \"><span class=\"comhead\"><a href=\"user?id=riffraff\">riffraff</a> <a href=\"item?id=9085736\">21 minutes ago</a> <span class=\"deadmark\"></span></span></div><br>\n" +
            "<span class=\"comment\"><font color=\"#000000\">my understanding: they have abandoned garbage collection in Obj-C years ago and think ARC is overall better.<p>And my guess: GC probably doesn&#x27;t play nice with recent&#x2F;future changes in OSX memory management (e.g. compressed memory) so the less apps use it the better the whole system is overall.<p>Hence, they probably want to get rid of the whole thing ASAP, forbidding it _for apps submitted to the mac app store_ is a reasonable step in that direction.</font></span><p><font size=\"1\"><u><a href=\"reply?id=9085736&amp;goto=item%3Fid%3D9085563\">reply</a></u></font></td></tr></table></td></tr><tr><td><table border=\"0\"><tr><td><img src=\"s.gif\" height=\"1\" width=\"40\"></td><td valign=\"top\"><center><a id=\"up_9085749\" href=\"vote?for=9085749&amp;dir=up&amp;goto=item%3Fid%3D9085563\"><div class=\"votearrow\" title=\"upvote\"></div></a><span id=\"down_9085749\"></span></center></td><td class=\"default\"><div style=\"margin-top:2px; margin-bottom:-10px; \"><span class=\"comhead\"><a href=\"user?id=MaxGabriel\">MaxGabriel</a> <a href=\"item?id=9085749\">14 minutes ago</a> <span class=\"deadmark\"></span></span></div><br>\n" +
            "<span class=\"comment\"><font color=\"#000000\">Could be they just don&#x27;t want to support the garbage collector anymore.</font></span><p><font size=\"1\"><u><a href=\"reply?id=9085749&amp;goto=item%3Fid%3D9085563\">reply</a></u></font></td></tr></table></td></tr><tr><td><table border=\"0\"><tr><td><img src=\"s.gif\" height=\"1\" width=\"0\"></td><td valign=\"top\"><center><a id=\"up_9085712\" href=\"vote?for=9085712&amp;dir=up&amp;goto=item%3Fid%3D9085563\"><div class=\"votearrow\" title=\"upvote\"></div></a><span id=\"down_9085712\"></span></center></td><td class=\"default\"><div style=\"margin-top:2px; margin-bottom:-10px; \"><span class=\"comhead\"><a href=\"user?id=jimrandomh\">jimrandomh</a> <a href=\"item?id=9085712\">28 minutes ago</a> <span class=\"deadmark\"></span></span></div><br>\n" +
            "<span class=\"comment\"><font color=\"#888888\">What the fuck? This is a <i>really</i> bad technical decision. As written, it sounds like they&#x27;re planning to reject garbage collection in-general, which would be a ban on most major programming languages. If you assume they only mean garbage collection in Objective C, it&#x27;s still a head-scratchingly stupid decision. Modifying an app to not use garbage collection is, in many cases, a major project that will introduce a lot of bugs. And the benefit is... very dubious at best.</font></span><p><font size=\"1\"><u><a href=\"reply?id=9085712&amp;goto=item%3Fid%3D9085563\">reply</a></u></font></td></tr></table></td></tr><tr><td><table border=\"0\"><tr><td><img src=\"s.gif\" height=\"1\" width=\"40\"></td><td valign=\"top\"><center><a id=\"up_9085744\" href=\"vote?for=9085744&amp;dir=up&amp;goto=item%3Fid%3D9085563\"><div class=\"votearrow\" title=\"upvote\"></div></a><span id=\"down_9085744\"></span></center></td><td class=\"default\"><div style=\"margin-top:2px; margin-bottom:-10px; \"><span class=\"comhead\"><a href=\"user?id=wsc981\">wsc981</a> <a href=\"item?id=9085744\">15 minutes ago</a> <span class=\"deadmark\"></span></span></div><br>\n" +
            "<span class=\"comment\"><font color=\"#000000\">I&#x27;m pretty sure this notification is only meant for apps using the Objective-C garbage collector, as the notification mentions that the GC was deprecated a while ago. I don&#x27;t think a lot of Mac developers used the Objective-C GC anyway.<p>Finally Apple mentions the following in it&#x27;s migration document [0]:<p><pre><code>  Is GC (Garbage Collection) deprecated on the Mac?\n" +
            "\n" +
            "  Garbage collection is deprecated in OS X Mountain Lion v10.8, and will \n" +
            "  be removed in a future version of OS X. Automatic Reference Counting is \n" +
            "  the recommended replacement technology. To aid in migrating existing \n" +
            "  applications, the ARC migration tool in Xcode 4.3 and later supports \n" +
            "  migration of garbage collected OS X applications to ARC.\n" +
            "</code></pre>\n" +
            "Based on the above statement, my guess is that&#x27;s Xcode has some build-in tools to convert GC code to ARC code, making the transition easier.<p><pre><code>  --- \n" +
            "</code></pre>\n" +
            "[0]: <a href=\"https://developer.apple.com/library/ios/releasenotes/ObjectiveC/RN-TransitioningToARC/Introduction/Introduction.html\" rel=\"nofollow\">https:&#x2F;&#x2F;developer.apple.com&#x2F;library&#x2F;ios&#x2F;releasenotes&#x2F;Objecti...</a></font></span><p><font size=\"1\"><u><a href=\"reply?id=9085744&amp;goto=item%3Fid%3D9085563\">reply</a></u></font></td></tr></table></td></tr><tr><td><table border=\"0\"><tr><td><img src=\"s.gif\" height=\"1\" width=\"40\"></td><td valign=\"top\"><center><a id=\"up_9085757\" href=\"vote?for=9085757&amp;dir=up&amp;goto=item%3Fid%3D9085563\"><div class=\"votearrow\" title=\"upvote\"></div></a><span id=\"down_9085757\"></span></center></td><td class=\"default\"><div style=\"margin-top:2px; margin-bottom:-10px; \"><span class=\"comhead\"><a href=\"user?id=agildehaus\">agildehaus</a> <a href=\"item?id=9085757\">10 minutes ago</a> <span class=\"deadmark\"></span></span></div><br>\n" +
            "<span class=\"comment\"><font color=\"#000000\">I have a perhaps unpopular opinion.  Anyone who hasn&#x27;t already begun this transition themselves, in an effort to have fewer bugs and cleaner code, DESERVES to have this transition forced upon them.</font></span><p><font size=\"1\"><u><a href=\"reply?id=9085757&amp;goto=item%3Fid%3D9085563\">reply</a></u></font></td></tr></table></td></tr></table><br><br>\n" +
            "</td></tr><tr><td><img src=\"s.gif\" height=\"10\" width=\"0\"><table width=\"100%\" cellspacing=\"0\" cellpadding=\"1\"><tr><td bgcolor=\"#ff6600\"></td></tr></table><br>\n" +
            "<center><center><a href=\"http://www.ycombinator.com/apply/\">Applications are open for YC Summer 2015</a></center><br><br>\n" +
            "<span class=\"yclinks\"><a href=\"newsguidelines.html\">Guidelines</a> | <a href=\"newsfaq.html\">FAQ</a> | <a href=\"mailto:hn@ycombinator.com\">Support</a> | <a href=\"lists\">Lists</a> | <a href=\"bookmarklet.html\">Bookmarklet</a> | <a href=\"dmca.html\">DMCA</a> | <a href=\"http://www.ycombinator.com/\">Y Combinator</a> | <a href=\"http://www.ycombinator.com/apply/\">Apply</a> | <a href=\"mailto:hn@ycombinator.com\">Contact</a></span><br><br>\n" +
            "<form method=\"get\" action=\"//hn.algolia.com/\">Search: <input type=\"text\" name=\"q\" value=\"\" size=\"17\"></form></center></td></tr></table></center></body></html>";



}