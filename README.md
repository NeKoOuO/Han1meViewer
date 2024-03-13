# Han1meViewer

![Han1meViewer](https://socialify.git.ci/YenalyLiew/Han1meViewer/image?description=1&font=KoHo&forks=1&issues=1&language=1&logo=https%3A%2F%2Fgithub.com%2FYenalyLiew%2FHan1meViewer%2Fblob%2Fmaster%2Ficon%2Ficon_han1me_viewer-rurires.png%3Fraw%3Dtrue&name=1&owner=1&pattern=Plus&pulls=1&stargazers=1&theme=Dark)

这是一个 [Hanime1](https://hanime1.me/) Android 平台的非官方浏览器。

Android 版本必须不小于 7.0 才能使用。

本项目仅用于学习和交流代码，不可闭源，严禁商用。

An unofficial Hanime1.me Application for Android.

Android version must be no less than 7.0 to be used.

This project is intended solely for purposes of learning codes. Commercial use is strictly
prohibited.

![download times](https://img.shields.io/github/downloads/YenalyLiew/Han1meViewer/total)

## Star History

感谢大家对本项目的支持

[![Star History Chart](https://api.star-history.com/svg?repos=YenalyLiew/Han1meViewer&type=Date)](https://star-history.com/#YenalyLiew/Han1meViewer&Date)

------

## 功能

- 主页
    - [x] 头图
    - [x] 推荐

- 新番新闻
    - [x] 月度切换
    - [x] 评论
        - [x] 子评论

- 用户
    - [x] 登入（不支持谷歌登录）
    - [x] 登出

- 搜索
    - [x] 高级搜索

- 影片
    - [x] 播放
    - [x] 添加/移除到喜欢列表
    - [x] 添加/移除到稍后观看
    - [x] 添加/移除到播放清单
    - [x] 下载
    - [x] 分享
    - [x] 同系列影片
    - [x] 推荐栏
    - [x] TAG
        - [x] 查看
        - [ ] 修改（做不了，有人机验证）
    - [x] 评论
        - [x] 子评论

- 喜欢列表
    - [x] 删除

- 稍后观看
    - [x] 删除

- 播放清单
    - [x] 修改清单
    - [x] 添加清单
    - [x] 删除清单
    - [x] 删除影片

- 漫画（不打算做）

## 痛点解决

如果你经常用官网，你会发现官网播放影片有两大缺陷：

1. 无法滑动调整进度条
2. 点击快进按钮容易误触进度条起始点

这对于咱们看的**时间敏感型**影片是不可忍受的。特别第二点，是真的🤬！！！

但是本软件不存在这些问题噢。

除此之外，在 v0.12.0 新增了新功能，关键H帧（名字我自己取的）！

### 关键H帧（对轴）

> 目前还属于实验性功能，如果你经常使用这个功能，不妨在讨论区提出你的建议，或者在 issue 区提交 bug，非常感谢！

什么是**关键H帧**？就是影片到达「**顶点**」的那一刻。

还在因为不能和影片内「顶点」同步，而不停地记着「顶点」的时刻然后看进度条卡时间同步吗？

现在你可能不需要了。如果你开启了该功能（默认开启），并且在影片内**手动标记**每一个关键H帧，它会在 5-30s
前在屏幕**左上角**倒计时提醒（可调整）。在 0-1s 时，会精确到一位小数，方便你更好的控制时间。

你还可以将你标记的分享给其他人，别人只需要点击右上角的添加就可以一键导入。

此外，还提供了**共享关键H帧集**。这些关键H帧是内置于软件里的，来源于贡献者在
GitHub 上的补充。目前是随着版本更新来更新共享关键H帧集，暂时不考虑服务器在线共享之类的，
~~前提是有贡献者来帮忙补充~~。

如果你想贡献关键H帧，请点击 [这里](https://github.com/YenalyLiew/Han1meViewer/blob/master/app/src/main/assets/h_keyframes/README.md)
查看应该怎么做。

## 存在问题

本软件和网站深度绑定，如果网站不能用，软件 100% 用不了。除非你下载过影片，那可以看。

只要网站添加了 CloudFlare 防护，软件就不能用。

只要该网站大改，我就得花很长时间去重解析网页，这个时候软件就不能用。

如果跳转到了反诈页面（某些地区把网站 ban 了），去改其他 DNS，多半是被劫持了！

~~PS：你还真给我大改了。。~~

## 常见问题

- **怎么下载？**

  不知道欸。

- **我只有日本节点怎么办？我甚至没有节点怎么办？**

  在 v0.12.6 中，新增**域名**更换功能，可以尝试将域名更换为 `hanime1.com`
  ，该网址在部分时间段不会重定向到 `hanime1.me`，而且**支持日本节点**使用。

  在 v0.13.0 中，新增**应用内置 Hosts**功能，可以让你**直连**网站。

- **为什么使用 应用内置 Hosts 后，登入界面无法打开？**

  你先等会，等该网页出现错误提示之后，会自动弹出一个登入框，你从那里登入就可以。

- **为什么不支持 Google 登录？**

  去问 Google 为什么不给开放吧，我目前是没什么好办法。

  到时候可能搞个 Cookie 登录，类似 EhViewer。

- **为什么检查更新总是失败？**

  更新接口走的是 Github，所以每天有下载限制，如果**你发现软件有重大问题但是提示更新失败**，请**直接**去
  Github Releases 界面查看是否有最新版下载。

- **你里面那个代理是什么？为什么我用了没梯子效果？**

  首先你要知道我那个**代理 ≠ 内置梯子**，是给特殊人群用的。你正常使用是需要自备梯子的。如果你懂，你也不会问这个问题；如果你不懂，那说明这个功能应该跟你没啥关系。

- **下载影片，但一段时间内没下载一直暂停，结果下一次继续之后总是弹错误通知怎么办？**

  按照通知上的影片信息，把相应影片删除然后重新下载。因为下载链接是**有时间限制的**，过了那个时间线链接就会
  **失效**，必须**自行重新下载**。下载功能的 bug 还是有点多的，如果遇到什么奇怪的问题欢迎提 issue！

## 更新内容

### v0.13.0

**[新增]** 重磅！应用内置 Hosts 功能，可以让你直连网站。

**[新增]** 本地登入功能。如果登入网页连接失败，等出现错误提示之后，会自动弹出一个登入框，可以从那里尝试登入。

**[修复]** 切换简繁字幕无效的问题。

**[修复]** 更新总是失效的问题。

**[修改]** 将网络相关设置单独提出来，方便管理。

### v0.12.6

**[新增]** 在设置里可以更换域名。

**[新增]** 检查更新失败两次以上帮助你跳转到 Github Releases 界面自行寻找最新版。

**[修复]** 播放清单加载失败的问题。

**[修复]** 下载界面点击右上角按钮后闪退的问题。

### v0.12.5

**[新增]** 下载一键全部暂停，全部开启。

**[新增]** 一键回到主页功能，和B站一样。

**[修复]** 部分影片界面无法打开的问题。

**[修复?]** 使用内置代理登录界面无法打开的问题。

**[优化]** 影片下载失败逻辑。

### v0.12.4

**[修复]** Android 14 无法进行下载的问题。

### v0.12.3

**[修复]** 某些影片界面无法打开的问题。

### v0.12.2

**[修复]** 打开 存在关键H帧的影片 时崩溃的问题。

**[修复?]** 部分手机长按快进崩溃的问题。

### v0.12.1

**[新增]** 首页新增“中文字幕”，“最新上市”等栏目。

**[新增]** 搜索标签新增“中文字幕”。

**[修改]** 新番新闻页面布局，切换通过左右滑动或点击小封面，长按小封面可以查看大图。

**[修改]** TAGS 默认为打开状态。

**[修复?]** 部分手机长按快进崩溃的问题。

### v0.12.0

**[新增]** 重磅！关键H帧！支持创建、分享，精准卡点不是问题。

**[新增]** 影片页面显示中文译名。

**[新增]** 在 GitHub 上开通了讨论区，并在设置里添加了跳转到 提交BUG 和 讨论区 的按钮，欢迎来吐槽！

### v0.11.1

**[修复]** 历史记录只有一条时，删除无响应。

**[优化]** 长按快进时触发音量、亮度、拖拽调整的问题。

### v0.11.0

也不是什么大功能更新，我也不知道为什么要 v0.11.0，就是想换个版本号。

**[新增]** 播放时，长按屏幕可快进。两边都是快进，没有快退，因为我觉得应该没人会用快退。

**[新增]** 可设置长按快进倍数。

**[新增]** “已下载”界面可以更改排序。

**[更改]** 历史记录删除由 左滑 修改为 长按 删除。

**[优化]** 调整部分 UI，看起来更顺眼。

### v0.10.8

**[新增]** 应用内可设置网络内置代理。

### v0.10.7

**[修复]** 播放器呼出倍速选单异常。

**[修复]** 隐藏播放器下方进度条不生效。

**[修复]** 主评论无法复制。

### v0.10.6

**[修复]** 首页头图不显示的问题。

**[新增]** 可设置播放器默认速度与滑动调整进度条的灵敏度。

**[新增]** 在首页点击相应栏能直接进入相关搜索页面。

### v0.10.5

**[新增]** 终于有图标了，感谢 [rurires](https://github.com/rurires) 提供！

**[修复]** 返回主页后总是展开头图。

**[新增]** 可关闭播放器下方进度条，在 设置->播放器设置 里，默认开启。

### v0.10.4

**[修复]** 影片界面调节音量崩溃。

### v0.10.3

**[新增]** 影片可以倍速了，全屏右上角！11种速度任你选择！

### v0.10.2

**[修复]** 打开搜索页面后，加载新的一页会跳回顶部，且错误提示经常抽风。

### v0.10.1

**[修复]** 打开搜索页面，当搜索页面为空或搜索失败时崩溃。

### v0.10.0

**[新增]** 播放清单。支持添加、删除、修改等一系列操作。创建播放清单在原网页中是在影片界面添加，而在本软件里更改为在播放清单界面添加。

**[新增]** 转官方网页下载。有些在本软件中无法解析的影片可以转到官方下载页面进行独立下载。

**[新增]** 主页头图显示。

**[改动]** 清单页面删除操作由从右向左滑动修改为长按。

**[优化]** 部分页面的 UI，清单页面影片布局修改为和官网一样的竖版。

**[修复]** 页面刷新后刷新标志不消失。在清单页面删除某项后再次回到该页面又复现。

### v0.9.0

下载界面新增“正在下载”，有进度显示，有通知（前提开通知权限），单线程下载但绝对够用。

影片界面添加厂商信息和“转到网页”按钮。

修复点击 tag 无法进入搜索界面的问题。

部分界面细微调整。

### v0.8.0

修复日期错误 bug，修复视频界面列表全为“现正播放”的 bug。

为增加流畅度，首页纵向视频排列改成横向，可能以后又会改回来。

搜索界面更改搜索栏，之前的太难用了。

标签可折叠。

新增点赞、点踩，且收藏，点赞点踩都会有显示了。

若视频长宽比小于 1 则全屏后为竖屏，反之则为横屏。

### v0.6.0

修复 bug，增加对部分视频的解析。

但目前有个 bug 没修：日期问题。所以你可能发现不少 1970-01-01，特别是在下载页面，那个我以后再搞，目前能用即可。

PS：一年前加了 CloudFlare 防护，然后又把前端改了，当时太忙就索性不搞了。最近暑假闲来无事，发现 CloudFlare
突然没了，索性重新搞了一遍，不过目前还会有一些
bug，但是基本使用还是可以的。而且他们主页改动巨大，但我还是套用的之前的模板，你可能会发现主页和网页版主页可能对应不上，但是不影响。

### v0.5.2

修复“没有登录失败的校验”的问题。

### v0.5.1

修复搜索栏逻辑问题。

### v0.5.0

调整部分 UI。适配 Android 13 通知权限。

修复删除下载影片后列表不能及时更新的问题。修复搜索栏部分逻辑。

修复从全屏切换分辨率后再返回正常界面，影片重置的问题。

修复新番导览日期显示错误的问题。

修改分辨率排列顺序，影片从最高画质开始播放，画质从高到低排列。

增加影片滑动阻尼系数，避免滑动过多导致不能微调。

### v0.4.1

修复未登入前无法查看评论的问题。

### v0.4.0

新增评论功能，包括影片评论，评论回复，子评论回复，但暂不支持点赞点踩。

新增清理缓存（快取）功能。

优化搜索体验，修复了一些小问题。

### v0.3.0

新增更新功能，不过依赖于 Github 的 API，可能有次数限制。

修复搜索时选择 Tag 后保存再打开变成全选的 bug。

优化用户体验。

### v0.2

修复旋转屏幕列表单列显示错乱的问题。

实现了下载功能，支持新番导览小图点击后打开大图的功能，支持保存。未测试过能否断点续传，貌似没实现，如果下载一半关闭程序可能会有
bug 产生，所以建议下载完了再关闭。

最低可用安卓版本从 Android 6.0 修改为 Android 7.0。

### v0.1

第一个版本，实现了基本使用，如观看视频，搜索，添加到历史记录等，暂不支持下载功能。

------

~~这里应该还有东西，以后再写！~~

