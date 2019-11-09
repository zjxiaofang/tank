onload = function ()
{
    var year=new Date().getFullYear(); //获取当前年份

    var sel = document.getElementById ('sel');//获取select下拉列表
    for ( var i = 1970; i < year+1; i++)//循环添加2006到当前年份加3年的每个年份依次添加到下拉列表
    {
        var option = document.createElement ('option');
        option.value = i;
        var txt = document.createTextNode (i);
        option.appendChild (txt);
        sel.appendChild (option);
    }

    var sel2 = document.getElementById ('sel2');//获取select下拉列表
    for(var j = 1; j <=12; j++){
        var option = document.createElement ('option');
        option.value = j;
        var txt = document.createTextNode (j);
        option.appendChild (txt);
        sel2.appendChild (option);
    }
}