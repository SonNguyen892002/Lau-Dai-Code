<%@ page pageEncoding="utf-8" %>

                <%@ include file="header.jsp" %>
                
			        <style type="text/css">
						.hh{
							color: var(--color-orange);
						}
					</style>


                    <!-- SECTION MOVE -->
                    <section class="container p0 top-header">
                        <div class="container-title">
                            <h1>PHIM HOẠT HÌNH:</h1>
                        </div>
                    </section>

                    <div class="data-container"></div>
                    <div id="pagination-demo1"></div>

                

            </div>

        </div>


        <script src="http://code.jquery.com/jquery-1.8.2.min.js"></script>
        <script src="../paginationjs-master/src/pagination.js"></script>

        <script>

            (function (name) {
                var container = $('#pagination-' + name);
                var sources = function () {
                    var result = [];

                    for (var i = 100; i > 0; i--) {
                        result.push('<div class="status"><h1>Full 20/20 vietsub</h1></div><img src="./images/img-avengers.jpg" alt=""><div class="movie-name"><h2>phim hoạt hình ' + i + '</h2></div><div class="icon-play"><i class="fas fa-play"></i></div>');
                    }

                    return result;
                }();

                var options = {
                    dataSource: sources,
                    pageSize: 20,
                    callback: function (response, pagination) {
                        window.console && console.log(response, pagination);

                        var dataHtml = '<div class="container-slider display-grid">';

                        $.each(response, function (index, item) {
                            dataHtml += '<a href="#" class="product">' + item + '</a>';
                        });

                        dataHtml += '</div>';

                        container.prev().html(dataHtml);
                    }
                };

                //$.pagination(container, options);

                container.addHook('beforeInit', function () {
                    window.console && console.log('beforeInit...');
                });
                container.pagination(options);

                container.addHook('beforePageOnClick', function () {
                    window.console && console.log('beforePageOnClick...');
                    //return false
                });
            })('demo1');
        </script>
		
		<%@ include file="footer.jsp" %>