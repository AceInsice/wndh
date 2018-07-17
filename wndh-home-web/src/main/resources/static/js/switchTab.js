(function(){
    //插件的功能都写在这个函数下
    //插件的主要功能可以总结至几个关键参数，通过这几个关键参数即可修改插件的主要功能
    var options = {
        spliter: 'char'
    }
    //helper
    /*去除某个特定的样式*/
    function removeClass( obj, cN ) {
        var strClassName = obj.className;
        var arrClassName = strClassName.split(' ');
        for( var i = 0; i < arrClassName.length; i++ ){
            if(arrClassName[i] == cN) {
                arrClassName.splice(i,1);
                obj.className=arrClassName.join(' ');
                break;
            }
        }
    }
    //增加某个特定的样式
    function addClass( obj, cN ) {
        var strClassName = obj.className;
        var arrClassName = strClassName.split(' ');
        for( var i = 0; i < arrClassName.length; i++ ){
            if(arrClassName[i] == cN) {
                break;
            }
        }
        if( i == arrClassName.length ) {
            obj.className = arrClassName.join(' ') + ' ' + cN;
        }
    }
    //切换功能实现
    function toSwitch(t, splitter) {
        var tabList = t.getElementsByClassName( 'tab-menu' )[0].getElementsByTagName( 'li' );
        var tabBox = t.getElementsByClassName( 'tab-box' )[0].getElementsByTagName( 'div' );
        for( var i = 0;i<tabList.length;i++ ) {
            tabList[i].onclick =function( num ) {
                function foo() {

                    //隐藏其他选项卡的内容，切换到我们点击的这个
                    for( var i = 0; i<tabList.length; i++ ) {
                        removeClass( tabList[i],'active' );
                        removeClass( tabBox[i],'active' );
                    }
                    addClass( this,'active' );
                    addClass( tabBox[num],'active' );
                }
                return foo;
            }(i);
        }
    }
    /*api指向的是使用者，故需要在用户调用插件时将api暴露给用户，因用户api是通过插件提供的名字进行使用
     * 故将api设置为object类型，用户就可以通过调用api的可以进行使用，具体的代码如下：
     * */
    var api = {
        config: function (opts) {
            if(!opts) {
                return options;
            }
            for(var key in opts) {
                options[key] = opts[key];
            }
            return this;
        },
        listen: function listen(elem) {
            if (typeof elem === 'string') {
                var elems = document.querySelectorAll(elem),
                    i = elems.length;
                while (i--) {
                    listen(elems[i]);
                }
                return
            }
            toSwitch(elem, options.splitter);

            return this;
        }
    }
    this.switchTab = api;
})();